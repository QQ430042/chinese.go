package org.chinese.go.service;
//package org.chinaese.go.base.api;
//
//import java.util.Date;
//
//import org.chinaese.go.AppException;
//import org.chinaese.go.annotation.Location;
//import org.chinaese.go.annotation.Operation;
//import org.chinaese.go.base.UserInfoVO;
//import org.chinaese.go.base.service.StUserService;
////import org.chinaese.go.constant.AppConstant;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.data.domain.Page;
////import org.springframework.data.domain.Pageable;
////import org.springframework.data.querydsl.QPageRequest;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * 
// * 
// * 用户信息服务
// * 
// *
// * @author 2430042@qq.com
// * @createDate 2019年1月7日
// * @version 2.1.5.RELEASE
// * @Project chinaese.go.base
// *
// * @copyright www.chinaesego.org
// */
//@RestController
//@RequestMapping("/api/users")
//@Location(code = "StUserApi", desc = "用户信息服务")
//public class StUserApi {
//
//	private static final Logger log = LoggerFactory.getLogger(StUserApi.class);
//
//	@Autowired
//	private StUserService userService;
//
//	/**
//	 * 
//	 * @param id
//	 * @return
//	 * @throws AppException
//	 */
//	@GetMapping("/{id}")
//	@Operation(code = "getById", desc = "获取信息")
//	public UserInfoVO getById(@PathVariable String id) throws AppException {
//		log.info("------------------------------------------------");
//		UserInfoVO obj = userService.findById(id);
//
//		return obj;
//	}
//	
//
////	/**
////	 * 
////	 * @param page
////	 * @param size
////	 * @param userInfo
////	 * @return
////	 * @throws AppException
////	 */
////	@GetMapping()
////	@Operation(code = "findByPage", desc = "查询列表")
////	public Page<UserInfoVO> findByPage(
////			@RequestParam(value = AppConstant.S_PAGE, defaultValue = AppConstant.N_PAGE) int page,
////			@RequestParam(value = AppConstant.S_SIZE, defaultValue = AppConstant.N_SIZE) int size,
////			UserInfoVO userInfo) throws AppException {
////
////		Pageable pageable = new QPageRequest(page, size);
////		Page<UserInfoVO> obj = userService.findAll(pageable);
////
////		return obj;
////	}
//
//	/**
//	 * 
//	 * @param id
//	 * @return
//	 * @throws AppException
//	 */
//	@DeleteMapping("/{id}")
//	@Operation(code = "delete", desc = "删除信息")
//	public UserInfoVO delete(@PathVariable String id) throws AppException {
//		log.info("----------------------------------");
//		log.info("userId【" + id + "】");
//		return new UserInfoVO();
//	}
//
//	/**
//	 * 
//	 * @param id
//	 * @param userInfo
//	 * @return
//	 * @throws AppException
//	 */
//	@PostMapping()
//	@Operation(code = "create", desc = "创建信息")
//	public UserInfoVO create(UserInfoVO userInfo) throws AppException {
//		userInfo.setUserCode("UC" + new Date().getTime());
////		userInfo.setEmail("2430042@qq.com");
////		userInfo.setOrgId("10000");
////		userInfo.setPhoneNumber("13099999999");
////		userInfo.setUserNickName("user nice " + new Date().getTime());
////		userInfo.setUserTitle("user title " + new Date().getTime());
////		userInfo.setUserType(UserType.general);
////		userInfo.setCreationTime(new Date());
////		userInfo.setLastUpdateTime(new Date());
////		userInfo.setLastUpdateId("5c39805f1d93121134df18d0");
////		userInfo.setCreatorId("5c39805f1d93121134df18d0");
////		userInfo.setUserNameCn("用户" + new Date().getTime());
////		userInfo.setUserNameEn("user " + new Date().getTime());
//
////		userService.createUser(userInfo);
//		return userInfo;
//	}
//
//	/**
//	 * 
//	 * @param id
//	 * @param userInfo
//	 * @return
//	 * @throws AppException
//	 */
//	@PatchMapping("/{id}")
//	@Operation(code = "update", desc = "更新信息")
//	public UserInfoVO update(@PathVariable String id, UserInfoVO userInfo) throws AppException {
//		log.info("+++++++++++++++++++++++++++++++++++");
//		return new UserInfoVO();
//	}
//
//	/**
//	 * 
//	 * @param id
//	 * @param userInfo
//	 * @return
//	 * @throws AppException
//	 */
//	@PutMapping("/{id}")
//	@Operation(code = "patch", desc = "补充信息")
//	public UserInfoVO patch(@PathVariable String id, UserInfoVO userInfo) throws AppException {
//		log.info("+++++++++++++++++++++++++++++++++++");
//		return new UserInfoVO();
//	}
//
//}
