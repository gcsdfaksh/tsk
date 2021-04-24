package com.xxkj.tsk.controlller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "study")
public class ShopController {

    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/look")
    public ResultData<Study> look(@RequestParam(value = "name") String name) {

        return studyService.look(name);
    }


}
bh