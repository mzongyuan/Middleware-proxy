package com.example.middlewareproxy.controller;

import com.example.middlewareproxy.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 供应商相关接口控制器
 * @Auth zongyuan.ma
 * @Date 2025/6/26 9:18
 * @Version V 1.0.0
 */
@RestController
@Slf4j
@RequestMapping("/v1/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    /**
     * @Description 商品审核状态回传
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/approveStatus")
    public String ProductApproveStatus(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 劳保订单创建
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/submitPreOrder")
    public String submitPreOrder(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 取消商品订单
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/cancelPreOrder")
    public String cancelPreOrder(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 订单确认收货
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/confirmReceipt")
    public String confirmReceipt(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 订单售后申请
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/afsApply")
    public String afsApply(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 取消订单售后申请
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/cancelAfsApply")
    public String cancelAfsApply(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 填写运单信息
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/updateSendInfo")
    public String updateSendInfo(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 换货确认收货
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/confirmeXchange")
    public String confirmeXchange(@RequestBody String data) {
        return null;
    }

}
