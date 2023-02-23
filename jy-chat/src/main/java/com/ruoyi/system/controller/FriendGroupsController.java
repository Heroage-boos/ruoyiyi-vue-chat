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
import com.ruoyi.system.domain.FriendGroups;
import com.ruoyi.system.service.IFriendGroupsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/friend_groups")
public class FriendGroupsController extends BaseController
{
    @Autowired
    private IFriendGroupsService friendGroupsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:groups:list')")
    @GetMapping("/list")
    public TableDataInfo list(FriendGroups friendGroups)
    {
        startPage();
        List<FriendGroups> list = friendGroupsService.selectFriendGroupsList(friendGroups);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:groups:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FriendGroups friendGroups)
    {
        List<FriendGroups> list = friendGroupsService.selectFriendGroupsList(friendGroups);
        ExcelUtil<FriendGroups> util = new ExcelUtil<FriendGroups>(FriendGroups.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:groups:query')")
    @GetMapping(value = "/{fgId}")
    public AjaxResult getInfo(@PathVariable("fgId") Long fgId)
    {
        return success(friendGroupsService.selectFriendGroupsByFgId(fgId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:groups:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FriendGroups friendGroups)
    {
        return toAjax(friendGroupsService.insertFriendGroups(friendGroups));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:groups:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FriendGroups friendGroups)
    {
        return toAjax(friendGroupsService.updateFriendGroups(friendGroups));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:groups:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fgIds}")
    public AjaxResult remove(@PathVariable Long[] fgIds)
    {
        return toAjax(friendGroupsService.deleteFriendGroupsByFgIds(fgIds));
    }
}
