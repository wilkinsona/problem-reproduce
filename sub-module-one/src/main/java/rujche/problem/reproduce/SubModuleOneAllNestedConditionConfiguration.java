package rujche.problem.reproduce;

import com.azure.spring.data.cosmos.config.AbstractCosmosConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

@ConditionalOnClass(SubModuleOneAllNestedCondition.class)
public class SubModuleOneAllNestedConditionConfiguration extends AbstractCosmosConfiguration {

    @Override
    protected String getDatabaseName() {
        return "";
    }
}
