/**
 * Copyright (C), 2020-2021, XXX有限公司
 * FileName: NotebookView
 * Author:   xujh
 * Date:     2021/8/22 10:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.chinese.go.notebook.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.Initializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * TODO [类型说明] 
 *
 * @author 2430042@qq.com
 * @createDate 2021/8/22
 * @version 2.x.x.RELEASE
 * @copyright www.chinesego.org
 */
@FXMLController
public class NoteTreeController implements Initializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoteTreeController.class);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LOGGER.info("initialize ... ");
    }
}