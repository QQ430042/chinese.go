/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: NotebookStarter
 * Author:   xujh
 * Date:     2021/8/16 20:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.chinese.go;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.chinese.go.notebook.view.NotebookView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动入口
 *
 * @author 2430042@qq.com
 * @createDate 2021/8/16
 * @version 2.x.x.RELEASE
 * @copyright www.chinesego.org
 */
@SpringBootApplication
public class NotebookStarter extends AbstractJavaFxApplicationSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(NotebookStarter.class);

    public static void main(String[] args) {
        LOGGER.info("Notebook Starter ... ");
        launch(NotebookStarter.class, NotebookView.class, args);
    }
}