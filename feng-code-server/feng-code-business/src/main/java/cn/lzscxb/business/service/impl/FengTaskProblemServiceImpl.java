package cn.lzscxb.business.service.impl;

import java.util.List;
import cn.lzscxb.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lzscxb.business.mapper.FengTaskProblemMapper;
import cn.lzscxb.domain.entity.FengTaskProblem;
import cn.lzscxb.business.service.IFengTaskProblemService;

/**
 * 学习任务与题目关联Service业务层处理
 * 
 * @author Likfees
 * @date 2022-12-25
 */
@Service
public class FengTaskProblemServiceImpl implements IFengTaskProblemService 
{
    @Autowired
    private FengTaskProblemMapper fengTaskProblemMapper;

    /**
     * 查询学习任务与题目关联
     * 
     * @param id 学习任务与题目关联主键
     * @return 学习任务与题目关联
     */
    @Override
    public FengTaskProblem selectFengTaskProblemById(Long id)
    {
        return fengTaskProblemMapper.selectFengTaskProblemById(id);
    }

    /**
     * 查询学习任务与题目关联列表
     * 
     * @param fengTaskProblem 学习任务与题目关联
     * @return 学习任务与题目关联
     */
    @Override
    public List<FengTaskProblem> selectFengTaskProblemList(FengTaskProblem fengTaskProblem)
    {
        return fengTaskProblemMapper.selectFengTaskProblemList(fengTaskProblem);
    }

    /**
     * 新增学习任务与题目关联
     * 
     * @param fengTaskProblem 学习任务与题目关联
     * @return 结果
     */
    @Override
    public int insertFengTaskProblem(FengTaskProblem fengTaskProblem)
    {
        fengTaskProblem.setCreateTime(DateUtils.getNowDate());
        return fengTaskProblemMapper.insertFengTaskProblem(fengTaskProblem);
    }

    /**
     * 修改学习任务与题目关联
     * 
     * @param fengTaskProblem 学习任务与题目关联
     * @return 结果
     */
    @Override
    public int updateFengTaskProblem(FengTaskProblem fengTaskProblem)
    {
        fengTaskProblem.setUpdateTime(DateUtils.getNowDate());
        return fengTaskProblemMapper.updateFengTaskProblem(fengTaskProblem);
    }

    /**
     * 批量删除学习任务与题目关联
     * 
     * @param ids 需要删除的学习任务与题目关联主键
     * @return 结果
     */
    @Override
    public int deleteFengTaskProblemByIds(Long[] ids)
    {
        return fengTaskProblemMapper.deleteFengTaskProblemByIds(ids);
    }

    /**
     * 删除学习任务与题目关联信息
     * 
     * @param id 学习任务与题目关联主键
     * @return 结果
     */
    @Override
    public int deleteFengTaskProblemById(Long id)
    {
        return fengTaskProblemMapper.deleteFengTaskProblemById(id);
    }
}
