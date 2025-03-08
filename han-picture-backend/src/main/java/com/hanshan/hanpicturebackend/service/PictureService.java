package com.hanshan.hanpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hanshan.hanpicturebackend.model.dto.picture.PictureQueryRequest;
import com.hanshan.hanpicturebackend.model.dto.picture.PictureUploadRequest;
import com.hanshan.hanpicturebackend.model.entity.Picture;
import com.hanshan.hanpicturebackend.model.entity.User;
import com.hanshan.hanpicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LEGION
 * @description 针对表【picture(图片)】的数据库操作Service
 * @createDate 2025-03-05 19:45:46
 */
public interface PictureService extends IService<Picture> {

    /**
     * 上传图片
     *
     * @param multipartFile 文件
     * @param pictureUploadRequest 图片上传请求
     * @param loginUser 上传用户
     * @return PictureVO
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 获取查询条件
     *
     * @param pictureQueryRequest 图片查询请求
     * @return QueryWrapper<Picture>
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 获取脱敏后的图片
     *
     * @param picture 图片
     * @param request HttpServletRequest
     * @return PictureVO
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取图片封装
     *
     * @param picturePage Page<Picture>
     * @param request HttpServletRequest
     * @return  Page<PictureVO>
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 图片数据校验，用于更新和编辑图片时进行判断
     *
     * @param picture 图片
     */
    void validPicture(Picture picture);
}
