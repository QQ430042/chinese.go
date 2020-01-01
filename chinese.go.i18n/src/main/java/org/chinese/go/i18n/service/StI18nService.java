package org.chinese.go.i18n.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.chinese.go.AppException;
import org.chinese.go.annotation.Location;
import org.chinese.go.annotation.Operation;
import org.chinese.go.AppConstant;
import org.chinese.go.OperationType;
import org.chinese.go.exception.InvalidDataException;
import org.chinese.go.exception.NoDataFoundException;
import org.chinese.go.i18n.I18nBean;
import org.chinese.go.i18n.entity.StI18n;
import org.chinese.go.i18n.repository.StI18nRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 *	国际化服务
 *
 * @author 2430042@qq.com
 * @createDate 2020年1月1日
 * @version 2.x.x.RELEASE
 * @Project chinese.go.i18n
 *
 * @copyright www.chinesego.org
 */
@RestController
@Transactional
@RequestMapping("/api/i18n")
@Location(code = "StI18nService", desc = "国际化服务")
public class StI18nService {

	private static final Log logger = LogFactory.getLog(StI18nService.class);

	@Autowired
	private StI18nRepository i18nRepository;
	
	@Autowired
	private StI18nService oneself;

	/**
	 * 创建资源
	 * 
	 * @param i18n
	 * @return
	 * @throws AppException
	 */
	@PostMapping("/manage")
	@Operation(operationType = OperationType.add)
	public StI18n create(@RequestBody StI18n i18n) throws AppException {

		if (StringUtils.isEmpty(i18n.getMsgKey())) {
			throw new InvalidDataException("MsgKey");
		}

		if (StringUtils.isEmpty(i18n.getMsgLanguage())) {
			throw new InvalidDataException("MsgLanguage");
		}

		if (StringUtils.isEmpty(i18n.getMsgValue())) {
			throw new InvalidDataException("MsgValue");
		}

		return i18nRepository.save(i18n);

	}

	/**
	 * 更新资源
	 * 
	 * @param i18n
	 * @return
	 * @throws AppException
	 */
	@PutMapping("/manage")
	@Operation(operationType = OperationType.update)
	public StI18n update(@RequestBody StI18n i18n) throws AppException {

		if (StringUtils.isEmpty(i18n.getMsgKey())) {
			throw new InvalidDataException("MsgKey");
		}

		if (StringUtils.isEmpty(i18n.getMsgLanguage())) {
			throw new InvalidDataException("MsgLanguage");
		}

		if (StringUtils.isEmpty(i18n.getMsgValue())) {
			throw new InvalidDataException("MsgValue");
		}

		return i18nRepository.save(i18n);

	}

	/**
	 * 获取列表
	 * 
	 * @param page
	 * @param size
	 * @return
	 * @throws AppException
	 */
	@SuppressWarnings("deprecation")
	@GetMapping("/manage/{page}/{size}")
	@Operation(operationType = OperationType.query)
	public Page<StI18n> listByPage(@PathVariable("page") int page, @PathVariable("size") int size,
			@RequestParam("keyword") String keyword) throws AppException {

		Pageable pageable = new QPageRequest(page, size);
		Page<StI18n> i18nPage = i18nRepository.findAll(pageable);

		return i18nPage;
	}

	/**
	 * 获取信息
	 * 
	 * @param msgId
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/manage/{msgId}")
	@Operation(operationType = OperationType.get)
	public StI18n getById(@PathVariable("msgId") String msgId) throws AppException {

		if (StringUtils.isEmpty(msgId)) {
			throw new InvalidDataException("msgId");
		}

		StI18n i18n = i18nRepository.getOne(msgId);

		if (i18n == null) {
			logger.error("No Data Found!");
			throw new NoDataFoundException(msgId);
		}

		return i18n;
	}

	/**
	 * 删除信息
	 * 
	 * @param msgId
	 * @throws AppException
	 */
	@DeleteMapping("/manage/{msgId}")
	@Operation(operationType = OperationType.delete)
	public void deleteById(@PathVariable("msgId") String msgId) throws AppException {

		if (StringUtils.isEmpty(msgId)) {
			throw new InvalidDataException("msgId");
		}

		StI18n i18n = i18nRepository.getOne(msgId);
		i18n.setDeleteFlag(AppConstant.Y);

		i18nRepository.delete(i18n);
	}

	/**
	 * 获取信息
	 * 
	 * @param language
	 * @param msgType
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/findByLanguage/{language}/{msgType}")
	@Operation(operationType = OperationType.query)
	@Cacheable(value = "i18n_cache", key = "#language+#msgType", unless = "#result == null")
	public Map<String, String> findByLanguage(@PathVariable("language") String language,
			@PathVariable("msgType") String msgType) throws AppException {

		if (StringUtils.isEmpty(language)) {
			throw new InvalidDataException("language");
		}

		Map<String, String> i18nMap = new HashMap<String, String>();

		List<StI18n> i18nList = null;
		if ("all".equalsIgnoreCase(msgType)) {
			i18nList = i18nRepository.findByMsgLanguage(language);
		} else {
			i18nList = i18nRepository.findByMsgTypeAndMsgLanguage(language, msgType);
		}

		if (i18nList == null) {
			return i18nMap;
		}

		for (StI18n i18n : i18nList) {
			i18nMap.put(i18n.getMsgKey(), i18n.getMsgValue());
		}

		return i18nMap;

	}

	/**
	 * 获取信息
	 *
	 * @param msgKey
	 * @return
	 * @throws AppException
	 */
	@GetMapping("/getByKey/{language}/{msgKey}")
	@Operation(operationType = OperationType.get)
	@Cacheable(value = "i18n_cache", key = "#language+#msgKey", unless = "#result == null")
	public I18nBean getByKey(@PathVariable("language") String language, @PathVariable("msgKey") String msgKey)
			throws AppException {

		if (StringUtils.isEmpty(language)) {
			throw new InvalidDataException("language");
		}

		if (StringUtils.isEmpty(msgKey)) {
			throw new InvalidDataException("msgKey");
		}

		Map<String, String> i18nMap = oneself.findByLanguage(language, "all");
		if (i18nMap != null && i18nMap.containsKey(msgKey)) {
			return new I18nBean(msgKey,i18nMap.get(msgKey));
		}

		throw new NoDataFoundException(msgKey);

	}
	
	
}
