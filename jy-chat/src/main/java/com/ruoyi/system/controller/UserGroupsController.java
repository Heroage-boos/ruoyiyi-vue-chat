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
import com.ruoyi.system.domain.UserGroups;
import com.ruoyi.system.service.IUserGroupsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/user_groups")
public class UserGroupsController extends BaseController
{
    @Autowired
    private IUserGroupsService userGroupsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:groups:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserGroups userGroups)
    {
        startPage();
        List<UserGroups> list = userGroupsService.selectUserGroupsList(userGroups);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:groups:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserGroups userGroups)
    {
        List<UserGroups> list = userGroupsService.selectUserGroupsList(userGroups);
        ExcelUtil<UserGroups> util = new ExcelUtil<UserGroups>(UserGroups.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:groups:query')")
    @GetMapping(value = "/{ugId}")
    public AjaxResult getInfo(@PathVariable("ugId") Long ugId)
    {
        return success(userGroupsService.selectUserGroupsByUgId(ugId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:groups:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserGroups userGroups)
    {
        return toAjax(userGroupsService.insertUserGroups(userGroups));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:groups:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserGroups userGroups)
    {
        return toAjax(userGroupsService.updateUserGroups(userGroups));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:groups:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ugIds}")
    public AjaxResult remove(@PathVariable Long[] ugIds)
    {
        return toAjax(userGroupsService.deleteUserGroupsByUgIds(ugIds));
    }
}
