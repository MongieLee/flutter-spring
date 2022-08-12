package cn.mgl.flutterspring.controller;

import cn.mgl.flutterspring.entity.CourseItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.mgl.flutterspring.entity.ResponseResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author MongieLee
 */
@RestController
@RequestMapping("/api/v1/course")
public class CourseController {
    @GetMapping("/getCourses")
    public ResponseResult getCourses() {
        List<CourseItem> carousels = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CourseItem newItem = new CourseItem();
            newItem.setId((int) Math.floor((Math.random()) * 1000));
            newItem.setImg("https://img.alicdn.com/imgextra/i2/6000000000435/O1CN01tZtm9f1F5H3gl3Awd_!!6000000000435-2-octopus.png");
            newItem.setName("轮播图" + i);
            carousels.add(newItem);
        }
        return ResponseResult.successful(carousels);
    }

    @GetMapping("{courseId}")
    public ResponseResult getCourseDetail(@PathVariable("courseId") Integer courseId) {
        System.out.println((courseId));
        Map<String, Object> resultMap = new HashMap();
        resultMap.put("id", (int) Math.floor(Math.random() * 1000));
        resultMap.put("title", "前端模拟面试：给你真实的求职体验和面试经验");
        resultMap.put("imagePath", "https://img.alicdn.com/imgextra/i1/6000000007450/O1CN01RivOxU24u9SfcE5Kj_!!6000000007450-0-octopus.jpg");
        resultMap.put("content", "<p class=\\\"ql-align-justify\\\"><span class=\\\"ql-size-large\\\">     为充分发挥人大代表的沟通桥梁作用，及时反映社情民意，落实开展以“我为民、我履职、我行动”为口号的“更好发挥人大代表作用”主题活动，7月29日上午，区人大香湾街道工委组织部分市人大香洲团第四组成员组成视察组深入到香湾街道海霞社区和朝阳社区，开展深化文明城市建设专题视察活动。</span></p><p class=\\\"ql-align-justify\\\"><span class=\\\"ql-size-large\\\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;视察组顶着烈日酷暑先后来到海霞新村、凤海新村、朝阳市场等地，实地察看了农贸市场、老旧小区的环境卫生整治情况以及停车难问题解决情况。代表们了解到，海霞新村和凤海新村建成时间早加上一直无物业管理，无法满足人们的居住需求，而且对照全国文明城市创建的标准，车辆的乱停乱放、环境卫生等问题已成为长期困扰广大业主的老大难问题。海霞社区党委顺应小区群众的呼声，在街道党工委的坚强领导下，以“政府推动，群众参与”为模式，组织施工队伍投入多工种施工人员，安全高效有序推进海霞新村的整治提升。</span></p><p class=\\\"ql-align-justify\\\"><span class=\\\"ql-size-large\\\">\\t朝阳市场1990年建成投入使用，是一个集农副产品，水产品，化妆品，美容产品等卖场于一身的大型综合性市场。由于年久失修，朝阳市场环境卫生极其恶劣，与全国文明城市创建的标准差距很大，成为香洲区一个不容忽视的社会问题集中点。朝阳市场的改造将从根本上改善朝阳市场环境，提升朝阳市场的管理水平和卫生状况逐步达到全国文明城市创建的标准。</span></p><p class=\\\"ql-align-justify\\\"><span class=\\\"ql-size-large\\\">\\t视察组视察结束后召开专题座谈会。会议听取了张志强主任汇报香湾街道深化文明城市建设工作的开展情况，一段时间以来，香湾街道结合香洲区专项行动，以社区居委会、农贸市场、交通站场、医院等“四个周边及300米范围”为重点区域，以“十个一批”专项行动为抓手，真抓实干，切实推进深化文明城市建设工作，取得了明显成效。在详细了解了香湾街道文明城市创建工作开展情况后，市人大代表们就如何进一步推进深化文明城市建设工作进行了深入交流。</span></p><p class=\\\"ql-align-justify\\\"><span class=\\\"ql-size-large\\\">\\t市人大代表们表示创建全国文明城市是提升人民群众幸福感、满意度的重要举措，也是加快发展、追赶超越的内在要求和必然行动。要积极开展形式多样的群众性活动，宣传动员广大群众支持深化文明城市建设工作，形成全民参与、共建共享的热潮，进一步推动深化文明城市建设工作向纵深发展。</span></p><p class=\\\"ql-align-center\\\"><span class=\\\"ql-size-large\\\"><span class=\\\"ql-cursor\\\">\uFEFF</span></span><img src=\\\"/upload/20220804/20220804110821268941.jpg\\\"><img src=\\\"/upload/20220804/20220804110817371729.jpg\\\"><img src=\\\"/upload/20220804/20220804110813490720.jpg\\\"></p>");
        return ResponseResult.successful(resultMap);
    }

}
