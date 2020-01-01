package org.chinese.go.i18n.service;
//package org.chinaese.go.i18n.service;
//
////import java.util.List;
//
//import org.chinaese.go.AppException;
//import org.chinaese.go.annotation.Location;
//import org.chinaese.go.annotation.Operation;
//import org.chinaese.go.base.entity.StUser;
//import org.chinaese.go.base.repository.StUserRepository;
//import org.chinaese.go.constant.AppConstant;
//import org.chinaese.go.exception.InvalidDataException;
//import org.chinaese.go.util.ContextUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.querydsl.QPageRequest;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * 
// * 
// *  用户信息服务
// *
// * @author 2430042@qq.com
// * @createDate 2019年7月26日
// * @version 2.1.5.RELEASE
// * @Project chinaese.go.core
// *
// * @copyright www.chinaesego.org
// */
//@RestController
//@RequestMapping("/api/base/users")
//@Location(code = "userService", desc = "分类信息服务")
//public class UserService {
//
//
//	@Autowired
//	private StUserRepository userRepository;
//
//	/**
//	 * 创建信息
//	 * 
//	 * @param user
//	 * @return
//	 * @throws AppException
//	 */
//	@PostMapping
//	@Operation(code = "create", desc = "创建资源")
//	public StUser create(@RequestBody StUser user) throws AppException {
//
//		if (user.getUserNameCn() == null) {
//			throw new InvalidDataException("UserNameCn");
//		}
//		
//		if (user.getUserNameEn() == null) {
//			throw new InvalidDataException("UserNameEn");
//		}
//
//		if (user.getUserEmail() == null) {
//			throw new InvalidDataException("UserEmail");
//		}
//
////		if (user.getuserType() == null) {
////			throw new InvalidDataException("userType");
////		}
////
////		StUser tmpStUser = userRepository.getStuserByuserId(user.getuserId());
////		System.out.println(tmpStuser);
////		if(tmpStuser!=null) {
////			throw new InvalidDataException("数据已经存在","userId["+user.getuserId()+"]已经存在！");
////		}
////		
////		tmpStUser = userRepository.getStuserByuserName(user.getuserName());
////		System.out.println(tmpStuser);
////		
////		if(tmpStuser!=null) {
////			throw new InvalidDataException("数据已经存在","userName["+user.getuserName()+"]已经存在！");
////		}
//		
////		if(tmpStuser!=null) {
////			throw new InvalidDataException("数据已经存在","userId["+user.getuserId()+"]已经存在！");
////		}
//		
////		tmpStUser = new Stuser();
////		tmpStuser.setuserName(user.getuserName());
////		
////		Example<Stuser> example = Example.of(tmpStuser);
////		
////		List<Stuser> list = userRepository.findAll(example);
////		System.out.println(list);
////		if(list!=null && list.size()>0) {
////			throw new InvalidDataException("数据已经存在","userName["+user.getuserName()+"]已经存在！");
////		}
//		
//		user.setCreatedUserId(ContextUtil.getUserId());
//		user.setLastModifiedUserId(ContextUtil.getUserId());
//
//		return userRepository.save(user);
//
//	}
//
//
//	/**
//	 * 创建信息
//	 * 
//	 * @param user
//	 * @return
//	 * @throws AppException
//	 */
//	@PutMapping
//	@Operation(code = "update", desc = "更新资源")
//	public StUser update(StUser user) throws AppException {
//
//		if (user.getUserId() == null) {
//			throw new InvalidDataException("UserNameCn");
//		}
//		
//		if (user.getUserNameCn() == null) {
//			throw new InvalidDataException("UserNameCn");
//		}
//		
//		if (user.getUserNameEn() == null) {
//			throw new InvalidDataException("UserNameEn");
//		}
//
//		if (user.getUserEmail() == null) {
//			throw new InvalidDataException("UserEmail");
//		}
//
//		user.setCreatedUserId(ContextUtil.getUserId());
//		user.setLastModifiedUserId(ContextUtil.getUserId());
//
//		return userRepository.save(user);
//
//	}
//
//
//	/**
//	 * 删除信息
//	 * 
//	 * @param userId
//	 * @return
//	 * @throws AppException
//	 */
//	@PatchMapping("/{userId}")
//	@Operation(code = "patch", desc = "删除资源")
//	public void patch(StUser user) throws AppException {
//
//		if (user.getUserId() == null) {
//			throw new InvalidDataException("userId");
//		}
//
//		StUser olduser = userRepository.getOne(user.getUserId());
//
//		userRepository.save(olduser);
//	}
//
//
//	/**
//	 * 获取列表
//	 * 
//	 * @param page
//	 * @param size
//	 * @param user
//	 * @return
//	 * @throws AppException
//	 */
//	@GetMapping
//	@Operation(code = "listByPage", desc = "获取列表")
//	public Page<StUser> listByPage(
//			@RequestParam(value = AppConstant.S_PAGE, defaultValue = AppConstant.N_PAGE) int page,
//			@RequestParam(value = AppConstant.S_SIZE, defaultValue = AppConstant.N_SIZE) int size) throws AppException {
//
//		Pageable pageable = new QPageRequest(page, size);
//		Page<StUser> userPage = userRepository.findAll(pageable);
//
//		return userPage;
//	}
//
//
//
//	/**
//	 * 查询列表
//	 * 
//	 * @param page
//	 * @param size
//	 * @param user
//	 * @return
//	 * @throws AppException
//	 */
//	@PostMapping("/search/{page}/{size}")
//	@Operation(code = "searchByPage", desc = "查询列表")
//	public Page<StUser> searchByPage(@PathVariable("page") int page, @PathVariable("size") int size,
//			StUser user) throws AppException {
//
//		Pageable pageable = new QPageRequest(page, size);
//		Page<StUser> userPage = userRepository.findAll(pageable);
//
//		return userPage;
//	}
//
//	/**
//	 * 获取信息
//	 * 
//	 * @param userId
//	 * @return
//	 * @throws AppException
//	 */
//	@GetMapping("/{userId}")
//	@Operation(code = "getById", desc = "获取资源")
//	public StUser getById(@PathVariable("userId") String userId) throws AppException {
//
//		if (userId == null) {
//			throw new InvalidDataException("userId");
//		}
//
//		StUser user = userRepository.getOne(userId);
//
//		return user;
//	}
//
//	/**
//	 * 删除信息
//	 * 
//	 * @param userId
//	 * @return
//	 * @throws AppException
//	 */
//	@DeleteMapping("/{userId}")
//	@Operation(code = "deleteById", desc = "删除资源")
//	public void deleteById(@PathVariable("userId") String userId) throws AppException {
//
//		if (userId == null) {
//			throw new InvalidDataException("userId");
//		}
//
//		StUser user = userRepository.getOne(userId);
//		user.setDeleteFlag(AppConstant.Y);
//
//		userRepository.save(user);
//	}
//
//}
