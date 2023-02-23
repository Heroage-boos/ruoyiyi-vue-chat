package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.MessagesType;
import com.ruoyi.system.service.IMessagesTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/message_type")
public class MessagesTypeController extends BaseController
{
    @Autowired
    private IMessagesTypeService messagesTypeService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(MessagesType messagesType)
    {
        startPage();
        List<MessagesType> list = messagesTypeService.selectMessagesTypeList(messagesType);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:type:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MessagesType messagesType)
    {
        List<MessagesType> list = messagesTypeService.selectMessagesTypeList(messagesType);
        ExcelUtil<MessagesType> util = new ExcelUtil<MessagesType>(MessagesType.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:type:query')")
    @GetMapping(value = "/{mtId}")
    public AjaxResult getInfo(@PathVariable("mtId") Long mtId)
    {
        return success(messagesTypeService.selectMessagesTypeByMtId(mtId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:type:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MessagesType messagesType)
    {
        return toAjax(messagesTypeService.insertMessagesType(messagesType));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:type:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MessagesType messagesType)
    {
        return toAjax(messagesTypeService.updateMessagesType(messagesType));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:type:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{mtIds}")
    public AjaxResult remove(@PathVariable Long[] mtIds)
    {
        return toAjax(messagesTypeService.deleteMessagesTypeByMtIds(mtIds));
    }
}
