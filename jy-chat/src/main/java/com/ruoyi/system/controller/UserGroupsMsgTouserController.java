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
import com.ruoyi.system.domain.UserGroupsMsgTouser;
import com.ruoyi.system.service.IUserGroupsMsgTouserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/user_groups_msg_touser")
public class UserGroupsMsgTouserController extends BaseController
{
    @Autowired
    private IUserGroupsMsgTouserService userGroupsMsgTouserService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:touser:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserGroupsMsgTouser userGroupsMsgTouser)
    {
        startPage();
        List<UserGroupsMsgTouser> list = userGroupsMsgTouserService.selectUserGroupsMsgTouserList(userGroupsMsgTouser);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:touser:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserGroupsMsgTouser userGroupsMsgTouser)
    {
        List<UserGroupsMsgTouser> list = userGroupsMsgTouserService.selectUserGroupsMsgTouserList(userGroupsMsgTouser);
        ExcelUtil<UserGroupsMsgTouser> util = new ExcelUtil<UserGroupsMsgTouser>(UserGroupsMsgTouser.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:touser:query')")
    @GetMapping(value = "/{gmId}")
    public AjaxResult getInfo(@PathVariable("gmId") Long gmId)
    {
        return success(userGroupsMsgTouserService.selectUserGroupsMsgTouserByGmId(gmId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:touser:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserGroupsMsgTouser userGroupsMsgTouser)
    {
        return toAjax(userGroupsMsgTouserService.insertUserGroupsMsgTouser(userGroupsMsgTouser));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:touser:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserGroupsMsgTouser userGroupsMsgTouser)
    {
        return toAjax(userGroupsMsgTouserService.updateUserGroupsMsgTouser(userGroupsMsgTouser));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:touser:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{gmIds}")
    public AjaxResult remove(@PathVariable Long[] gmIds)
    {
        return toAjax(userGroupsMsgTouserService.deleteUserGroupsMsgTouserByGmIds(gmIds));
    }
}
