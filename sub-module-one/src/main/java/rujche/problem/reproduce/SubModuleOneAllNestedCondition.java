package rujche.problem.reproduce;

import com.azure.spring.data.cosmos.core.CosmosTemplate;
import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

public class SubModuleOneAllNestedCondition extends AllNestedConditions {

    SubModuleOneAllNestedCondition() {
        super(ConfigurationPhase.PARSE_CONFIGURATION);
    }

    @ConditionalOnClass(CosmosTemplate.class)
    static class ClassPathCondition {
    }
}
