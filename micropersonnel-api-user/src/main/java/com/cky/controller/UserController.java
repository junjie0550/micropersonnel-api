package com.cky.controller;


import com.cky.Result;
import com.cky.entity.MpPicture;
import com.cky.entity.MpUserInfo;
import com.cky.service.PictureService;
import com.cky.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private PictureService pictureService;

    @PostMapping("/findById")
    public Result findById(@RequestParam(value = "id") String id) {
        Result result = new Result();
        MpUserInfo byId = null;
        try {
            byId = userService.findById(id);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(byId);
        return result;
    }

    @CrossOrigin
    @PostMapping("/findAll")
    public Result findAll() {
        Result result = new Result();
        List<MpUserInfo> all = null;

        try {
            all = userService.findAll();
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(all);
        return result;
    }

    @CrossOrigin
    @PostMapping("/insert")
    public Result insert(MpUserInfo mpUserInfo) {
        Result result = new Result();
        int insert = 0;
        try {
            insert = userService.insert(mpUserInfo);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(insert > 0);
        return result;
    }

    @PostMapping("/update")
    public Result update(MpUserInfo mpUserInfo) {
        Result result = new Result();
        int update = 0;
        try {
            update = userService.update(mpUserInfo);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(update > 0);
        return result;
    }

    @DeleteMapping("/deleteByid")
    public Result deleteById(String id) {
        Result result = new Result();
        int delect = 0;
        try {
            delect = userService.delect(id);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(delect > 0);
        return result;
    }

    /**
     * 通过id查询图片
     * @param id
     * @return {@link MpPicture}
     */

    @PostMapping("/pictureSelect")
    public Result selectPicture(@RequestParam(value = "id") String id) {
        Result result = new Result();
        MpPicture select = null;
        try {
            select = pictureService.select(id);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(null != select);
        return result;
    }

    /**
     * 通过id删除数据库的图片
     * @param id
     * @return {@link Integer}
     */
    @PostMapping("/picturedeleteByid")
    public Result picturedeleteByid(@RequestParam(value = "id") String id) {
        Result result = new Result();
        int flg = 0;
        try {
            flg = pictureService.deleteByid(id);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(flg > 0);
        return result;
    }

    /**
     *  通过id更新图片
     * @param mpPicture
     * @return {@link Integer}
     */

    @PostMapping("/prictureupdate")
    public Result prictureupdate(@RequestBody MpPicture mpPicture) {
        Result result = new Result();
        int update = 0;
        try {
            update = pictureService.update(mpPicture);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(update > 0);
        return result;
    }

    /**
     *  查询所有图片
     * @return {@link MpPicture}
     */

    @PostMapping("/prictureFinAll")
    public Result prictureFinAll() {
        Result result = new Result();
        List<MpPicture> mpPictures = null;
        try {
            mpPictures = pictureService.finAll();
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(null != mpPictures);
        return result;

    }

    /**
     * 根据json字符来插入
     * @param mpPicture
     * @return {@link Integer}
     */

    @PostMapping("/prictureInsert")
    public Result prictureInsert(@RequestBody MpPicture mpPicture){
        Result result = new Result();
        int insert=0;
        try {
            insert = pictureService.insert(mpPicture);
            result.setFlag(true);
        } catch (Exception e) {
            result.setData(e.getMessage());
            result.setFlag(false);
        }
        result.setData(insert > 0);
        return result;
    }

}
