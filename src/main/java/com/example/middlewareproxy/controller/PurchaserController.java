package com.example.middlewareproxy.controller;

import com.example.middlewareproxy.service.SupplierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 采购平台相关接口控制器
 * @Auth zongyuan.ma
 * @Date 2025/6/26 9:19
 * @Version V 1.0.0
 */
@RestController
@Slf4j
@RequestMapping("/v1/purchaser")
public class PurchaserController {

    @Autowired
    private SupplierService supplierService;

    /**
     * @Description 获取平台商品类目
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/category/getByLevel")
    public String getCategoryByLevel(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 获取平台商品品牌信息
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/category/getBrand")
    public String getCategoryBrand(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 查询平台类目属性
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/category/getAttribute")
    public String getCategoryAttribute(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 获取平台劳保商品池
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/category/getProdpool")
    public String getCategoryProdpool(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 平台级新增/更新商品信息
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/product/update")
    public String doProductUpdate(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 商品提交审核
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/product/approve")
    public String doProductApprove(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 省市区查询接口
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/address/information")
    public String getAddressInformation(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 供应商配送通知接口
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/consignment/inform")
    public String doConsignmentInform(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 配送单妥投确认接口
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/consignment/confirmd")
    public String doConsignmentConfirmd(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 订单物流通知接口
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/logistics/notice")
    public String doLogisticsNotice(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 售后审核通知接口
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/afterSale/audit/notice")
    public String doafterSaleAuditNotice(@RequestBody String data) {
        return null;
    }

    /**
     * @Description 售后结果通知接口
     * @Auth zongyuan.ma
     * @Date 2025/6/26 9:53
     * @Version V 1.0.0
     */
    @PostMapping("/afterSale/result/notice")
    public String doAfterSaleResultNotice(@RequestBody String data) {
        return null;
    }
}
