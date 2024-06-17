package rujche.problem.reproduce;

import com.azure.spring.data.cosmos.core.CosmosTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

@ConditionalOnClass(CosmosTemplate.class)
public class SubModuleOneConditionalOnClassConfiguration {

}
