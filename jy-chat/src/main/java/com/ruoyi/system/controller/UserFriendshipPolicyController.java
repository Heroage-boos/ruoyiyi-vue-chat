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
import com.ruoyi.system.domain.UserFriendshipPolicy;
import com.ruoyi.system.service.IUserFriendshipPolicyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author yaojieyun
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/policy")
public class UserFriendshipPolicyController extends BaseController
{
    @Autowired
    private IUserFriendshipPolicyService userFriendshipPolicyService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:policy:list')")
    @GetMapping("/list")
    public TableDataInfo list(UserFriendshipPolicy userFriendshipPolicy)
    {
        startPage();
        List<UserFriendshipPolicy> list = userFriendshipPolicyService.selectUserFriendshipPolicyList(userFriendshipPolicy);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:policy:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UserFriendshipPolicy userFriendshipPolicy)
    {
        List<UserFriendshipPolicy> list = userFriendshipPolicyService.selectUserFriendshipPolicyList(userFriendshipPolicy);
        ExcelUtil<UserFriendshipPolicy> util = new ExcelUtil<UserFriendshipPolicy>(UserFriendshipPolicy.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:policy:query')")
    @GetMapping(value = "/{uFpId}")
    public AjaxResult getInfo(@PathVariable("uFpId") Long uFpId)
    {
        return success(userFriendshipPolicyService.selectUserFriendshipPolicyByUFpId(uFpId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:policy:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UserFriendshipPolicy userFriendshipPolicy)
    {
        return toAjax(userFriendshipPolicyService.insertUserFriendshipPolicy(userFriendshipPolicy));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:policy:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UserFriendshipPolicy userFriendshipPolicy)
    {
        return toAjax(userFriendshipPolicyService.updateUserFriendshipPolicy(userFriendshipPolicy));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:policy:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uFpIds}")
    public AjaxResult remove(@PathVariable Long[] uFpIds)
    {
        return toAjax(userFriendshipPolicyService.deleteUserFriendshipPolicyByUFpIds(uFpIds));
    }
}
