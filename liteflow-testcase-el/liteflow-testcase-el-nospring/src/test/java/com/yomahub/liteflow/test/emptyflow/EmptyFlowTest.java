package com.yomahub.liteflow.test.emptyflow;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.core.FlowExecutorHolder;
import com.yomahub.liteflow.property.LiteflowConfig;
import com.yomahub.liteflow.test.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 切面场景单元测试
 * @author Bryan.Zhang
 */
public class EmptyFlowTest extends BaseTest {

    private static FlowExecutor flowExecutor;

    @BeforeClass
    public static void init(){
        LiteflowConfig config = new LiteflowConfig();
        config.setRuleSource("emptyFlow/flow.el.xml");
        flowExecutor = FlowExecutorHolder.loadInstance(config);
    }

    //测试空flow的情况下，liteflow是否能正常启动
    @Test
    public void testEmptyFlow() {
        //不做任何事，为的是能正常启动
    }
}
