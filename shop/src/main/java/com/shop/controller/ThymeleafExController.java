package com.shop.controller;

import com.shop.dto.ItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/thymeleaf")
@Slf4j
public class ThymeleafExController {

    @GetMapping(value="/ex01")
    public String thymeleafExample01(Model model) {
        model.addAttribute("data", "타임리프 예제");
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping(value="/ex02")
    public String thymeleafExample02(Model model) {
        log.info("되니");
        ItemDto itemDto = ItemDto.builder()
                .itemDetail("상품 상세 설명")
                .itemNm("테스트 상품1")
                .price(10000)
                .regTime(LocalDateTime.now())
                .build();

        model.addAttribute("itemDto", itemDto);

        return "thymeleafEx/thymeleafEx02";
    }

    @GetMapping(value="/ex03")
    public String thymeleafExample03(Model model) {

        List<ItemDto> itemDtoList = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
        ItemDto itemDto = ItemDto.builder()
                .itemDetail("상품 상세 설명 " + i)
                .itemNm("테스트 상품 " + i)
                .price(10000*i)
                .regTime(LocalDateTime.now())
                .build();

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);

        return "thymeleafEx/thymeleafEx03";
    }

    @GetMapping(value="/ex04")
    public String thymeleafExample04(Model model) {

        List<ItemDto> itemDtoList = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            ItemDto itemDto = ItemDto.builder()
                    .itemDetail("상품 상세 설명 " + i)
                    .itemNm("테스트 상품 " + i)
                    .price(10000*i)
                    .regTime(LocalDateTime.now())
                    .build();

            itemDtoList.add(itemDto);
        }

        model.addAttribute("itemDtoList", itemDtoList);

        return "thymeleafEx/thymeleafEx04";
    }

    @GetMapping(value="/ex05")
    public String ThymeleafExample05() {
        return "thymeleafEx/thymeleafEx05";
    }

    @GetMapping(value="/ex06")
    public String ThymeleafExample06(@RequestParam("param1") String p1, @RequestParam("param2")String p2, Model model) {

        model.addAttribute("param1", p1);
        model.addAttribute("param2", p2);

        return "thymeleafEx/thymeleafEx06";
    }
}
