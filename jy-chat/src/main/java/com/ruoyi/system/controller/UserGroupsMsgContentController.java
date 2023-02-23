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
import com.ruoyi.system.domain.UserGroupsMsgContent;
import com.ruoyi.system.service.IUserGroupsMsgContentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/content")
public class UserGroupsMsgContentController extends BaseController
{
    @Autowired
    private IUserGroupsMsgContentService userGroupsMsgContentService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:content:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserGroupsMsgContent userGroupsMsgContent)
    {
        startPage();
        List<UserGroupsMsgContent> list = userGroupsMsgContentService.selectUserGroupsMsgContentList(userGroupsMsgContent);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:content:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserGroupsMsgContent userGroupsMsgContent)
    {
        List<UserGroupsMsgContent> list = userGroupsMsgContentService.selectUserGroupsMsgContentList(userGroupsMsgContent);
        ExcelUtil<UserGroupsMsgContent> util = new ExcelUtil<UserGroupsMsgContent>(UserGroupsMsgContent.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:content:query')")
    @GetMapping(value = "/{gm_Id}")
    public AjaxResult getInfo(@PathVariable("gm_Id") Long gm_Id)
    {
        return success(userGroupsMsgContentService.selectUserGroupsMsgContentByGmId(gm_Id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:content:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserGroupsMsgContent userGroupsMsgContent)
    {
        return toAjax(userGroupsMsgContentService.insertUserGroupsMsgContent(userGroupsMsgContent));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:content:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserGroupsMsgContent userGroupsMsgContent)
    {
        return toAjax(userGroupsMsgContentService.updateUserGroupsMsgContent(userGroupsMsgContent));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:content:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{gm_Ids}")
    public AjaxResult remove(@PathVariable Long[] gm_Ids)
    {
        return toAjax(userGroupsMsgContentService.deleteUserGroupsMsgContentByGmIds(gm_Ids));
    }
}
