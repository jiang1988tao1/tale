package com.tale.controller;


import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.ui.RestResponse;
import com.tale.service.OptionsService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Descriptions <br>
 *
 * @author taotao <br>
 * @version 1.0 <br>
 * @createDate 2020/03/13 9:26 上午 <br>
 * @see com.tale.controller <br>
 */
@Slf4j
@Path(value = "public/api", restful = true)
public class PublicApiController extends BaseController {
    @Inject
    private OptionsService optionsService;

    @GetRoute("icp")
    public RestResponse options() {
        Map<String, String> options = optionsService.getOptions();
        return RestResponse.ok(options.get("ICP_license"));
    }

}
