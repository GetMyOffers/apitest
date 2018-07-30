package io.nebulas.apitest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.stereotype.Component;

/**
 * created by Keqi Huang on 2018/7/26.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                BalanceControllerTest.class
        }
)
@Component
public class ApiTestSuite {

}
