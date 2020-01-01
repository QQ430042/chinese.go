/**
 * 
 */
package org.chinese.go.util;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.persistence.Entity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.chinese.go.annotation.Location;
import org.chinese.go.annotation.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * 
 *  	权限工具类
 *
 * @author 2430042@qq.com
 * @createDate 2019年11月23日
 * @version 2.1.5.RELEASE
 * @Project chinaese.go.core
 *
 * @copyright www.chinaesego.org
 */
public class AnnotationUtil {

	private static final Log logger = LogFactory.getLog(AnnotationUtil.class);


	/**
	 * 	获取权限码全集
	 * 
	 * @param basePackage
	 * @return
	 */
	public static List<String> getAllPermissionCodes(String basePackage) {

		logger.info("basePackage【" + basePackage + "】");

		List<String> permissionCodeList = new ArrayList<String>();

		// 包下面的类
		Set<Class<?>> clazzs = getClasses(basePackage);

		if (clazzs == null) {
			return new ArrayList<String>();
		}		

		logger.info("Class size 【" + clazzs.size() + "】\n");

		for (Class<?> clazz : clazzs) {

			// 获取类上的注解
			Location location = clazz.getAnnotation(Location.class);

			if (location == null) {
				continue;
			}

			logger.info("Location  code【" + location.code() + "】" + " desc【" + location.desc() + "】");

			// 获取方法上的注解
			Method[] methods = clazz.getDeclaredMethods();

			if (methods == null) {
				continue;
			}

			for (Method method : methods) {
				Operation operation = method.getAnnotation(Operation.class);

				if (operation == null) {
					continue;
				}

				String permissionCode = location.code() + "$" + operation.operationType().getCode();

				logger.info("Operation code【" + permissionCode+ "】" + " desc【" + location.desc() + "$" + operation.operationType().getDesc() + "】");

				permissionCodeList.add(permissionCode);

			}

		}
		return permissionCodeList;

	}

	/**
	 * 	获取服务地址全集
	 * 
	 * @param basePackage
	 * @return
	 */
	public static List<String> getAllRestUrl(String basePackage) {

		List<String> restPathList = new ArrayList<String>();

		// 包下面的类
		Set<Class<?>> clazzs = getClasses(basePackage);

		if (clazzs == null) {
			return new ArrayList<String>();
		}


		for (Class<?> clazz : clazzs) {

			// 获取类上的注解
			RequestMapping classPath = clazz.getAnnotation(RequestMapping.class);
			//			log.info( "classPath【"+classPath+ "】");
			if (classPath == null) {
				continue;
			}

			// 获取方法上的注解
			Method[] methods = clazz.getDeclaredMethods();

			if (methods == null) {
				continue;
			}

			for (Method method : methods) {

				GetMapping getMapping= method.getAnnotation(GetMapping.class);				
				if (getMapping != null) {
					String annotationType = getMapping.annotationType().toString();
					String methodPath = "";
					if(getMapping.value().length>0)
						methodPath = getMapping.value()[0];
					String restPath = classPath.value()[0] + methodPath;
					logger.info( "Rest path【"+annotationType.substring(annotationType.lastIndexOf('.')+1)+"   】"+" - 【" + restPath + "】");
					restPathList.add(restPath);
					continue;
				}

				DeleteMapping deleteMapping= method.getAnnotation(DeleteMapping.class);				
				if (deleteMapping != null) {
					String annotationType = deleteMapping.annotationType().toString();
					String methodPath = "";
					if(deleteMapping.value().length>0)
						methodPath = deleteMapping.value()[0];
					String restPath = classPath.value()[0] + methodPath;
					logger.info( "Rest path【"+annotationType.substring(annotationType.lastIndexOf('.')+1)+"】"+" - 【" + restPath + "】");
					restPathList.add(restPath);
					continue;
				}

				PostMapping postMapping= method.getAnnotation(PostMapping.class);				
				if (postMapping != null) {
					String annotationType = postMapping.annotationType().toString();
					String methodPath = "";
					if(postMapping.value().length>0)
						methodPath = postMapping.value()[0];
					String restPath = classPath.value()[0] + methodPath;
					logger.info( "Rest path【"+annotationType.substring(annotationType.lastIndexOf('.')+1)+"  】"+" - 【" + restPath + "】");
					restPathList.add(restPath);
					continue;
				}

				PutMapping putMapping= method.getAnnotation(PutMapping.class);				
				if (putMapping != null) {
					String annotationType = putMapping.annotationType().toString();
					String methodPath = "";
					if(putMapping.value().length>0)
						methodPath = putMapping.value()[0];
					String restPath = classPath.value()[0] + methodPath;
					logger.info( "Rest path【"+annotationType.substring(annotationType.lastIndexOf('.')+1)+"   】"+" - 【" + restPath + "】");
					restPathList.add(restPath);
					continue;
				}

				PatchMapping patchMapping= method.getAnnotation(PatchMapping.class);				
				if (patchMapping != null) {
					String annotationType = patchMapping.annotationType().toString();
					String methodPath = "";
					if(patchMapping.value().length>0)
						methodPath = patchMapping.value()[0];
					String restPath = classPath.value()[0] + methodPath;
					logger.info( "Rest path【"+annotationType.substring(annotationType.lastIndexOf('.')+1)+" 】"+" - 【" + restPath + "】");
					restPathList.add(restPath);
					continue;
				}

			}

		}
		return restPathList;

	}

	/**
	 * 	获取Entity全集
	 * 
	 * @param basePackage
	 * @return
	 */
	public static List<String> getAllDocument(String basePackage) {

		List<String> documentList = new ArrayList<String>();

		// 包下面的类
		Set<Class<?>> clazzs = getClasses(basePackage);

		if (clazzs == null) {
			return new ArrayList<String>();
		}

		for (Class<?> clazz : clazzs) {

			// 获取类上的注解
			Entity document = clazz.getAnnotation(Entity.class);

			if (document == null) {
				continue;
			}

			logger.info("Entity name【" + clazz.getName() + "】");
			documentList.add(clazz.getName());

		}

		return documentList;

	}

	/**
	 * 	从包package中获取所有的Class
	 *
	 * @param pack
	 * @return
	 */
	private static Set<Class<?>> getClasses(String pack) {

		// 第一个class类的集合
		Set<Class<?>> classes = new LinkedHashSet<>();
		// 是否循环迭代
		boolean recursive = true;

		// 获取包的名字 并进行替换
		String packageName = pack;
		String packageDirName = packageName.replace('.', '/');
		// 定义一个枚举的集合 并进行循环来处理这个目录下的things
		Enumeration<URL> dirs;
		try {
			dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
			// 循环迭代下去
			while (dirs.hasMoreElements()) {
				// 获取下一个元素
				URL url = dirs.nextElement();
				// 得到协议的名称
				String protocol = url.getProtocol();
				// 如果是以文件的形式保存在服务器上
				if ("file".equals(protocol)) {
					// 获取包的物理路径
					String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
					// 以文件的方式扫描整个包下的文件 并添加到集合中
					findAndAddClassesInPackageByFile(packageName, filePath, recursive, classes);
				} else if ("jar".equals(protocol)) {
					// 如果是jar包文件
					// 定义一个JarFile
					// System.err.println("jar类型的扫描");
					JarFile jar;
					try {
						// 获取jar
						jar = ((JarURLConnection) url.openConnection()).getJarFile();
						// 从此jar包 得到一个枚举类
						Enumeration<JarEntry> entries = jar.entries();
						// 同样的进行循环迭代
						while (entries.hasMoreElements()) {
							// 获取jar里的一个实体 可以是目录 和一些jar包里的其他文件 如META-INF等文件
							JarEntry entry = entries.nextElement();
							String name = entry.getName();
							// 如果是以/开头的
							if (name.charAt(0) == '/') {
								// 获取后面的字符串
								name = name.substring(1);
							}
							// 如果前半部分和定义的包名相同
							if (name.startsWith(packageDirName)) {
								int idx = name.lastIndexOf('/');
								// 如果以"/"结尾 是一个包
								if (idx != -1) {
									// 获取包名 把"/"替换成"."
									packageName = name.substring(0, idx).replace('/', '.');
								}
								// 如果可以迭代下去 并且是一个包
								if ((idx != -1) || recursive) {
									// 如果是一个.class文件 而且不是目录
									if (name.endsWith(".class") && !entry.isDirectory()) {
										// 去掉后面的".class" 获取真正的类名
										String className = name.substring(packageName.length() + 1, name.length() - 6);
										try {
											// 添加到classes
											classes.add(Class.forName(packageName + '.' + className));
										} catch (ClassNotFoundException e) {
											e.printStackTrace();
										}
									}
								}
							}
						}
					} catch (IOException e) {
						// log.error("在扫描用户定义视图时从jar包获取文件出错");
						e.printStackTrace();
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return classes;
	}

	/**
	 * 	以文件的形式来获取包下的所有Class
	 *
	 * @param packageName
	 * @param packagePath
	 * @param recursive
	 * @param classes
	 */
	private static void findAndAddClassesInPackageByFile(String packageName, String packagePath, final boolean recursive, Set<Class<?>> classes) {
		// 获取此包的目录 建立一个File
		File dir = new File(packagePath);
		// 如果不存在或者 也不是目录就直接返回
		if (!dir.exists() || !dir.isDirectory()) {
			logger.warn("用户定义包名 " + packageName + " 下没有任何文件");
			return;
		}
		// 如果存在 就获取包下的所有文件 包括目录
		File[] dirfiles = dir.listFiles(new FileFilter() {
			// 自定义过滤规则 如果可以循环(包含子目录) 或则是以.class结尾的文件(编译好的java类文件)
			public boolean accept(File file) {
				return (recursive && file.isDirectory()) || (file.getName().endsWith(".class"));
			}
		});
		// 循环所有文件
		for (File file : dirfiles) {
			// 如果是目录 则继续扫描
			if (file.isDirectory()) {
				findAndAddClassesInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive, classes);
			} else {
				// 如果是java类文件 去掉后面的.class 只留下类名
				String className = file.getName().substring(0, file.getName().length() - 6);
				try {
					// 添加到集合中去
					//classes.add(Class.forName(packageName + '.' + className));
					// 这里用forName有一些不好，会触发static方法，没有使用classLoader的load干净
					classes.add(Thread.currentThread().getContextClassLoader().loadClass(packageName + '.' + className));
				} catch (ClassNotFoundException e) {
					logger.error("找不到【"+className+"】此类的.class文件");

				}
			}
		}
	}
}
