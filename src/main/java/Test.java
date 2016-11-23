import hex.genmodel.easy.exception.PredictException;
import org.wso2.carbon.ml.siddhi.extension.h2omojo.ModelHandler;

import java.io.IOException;

/**
 * Created by wso2123 on 11/9/16.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, PredictException {
        ModelHandler model = new ModelHandler("/home/wso2123/Documents/MyProjects/h2omojo/DRF_model_python_1478600965972_1.zip");
        Object[] data = {7.0, 5.0, 2.0, 1.0};
        System.out.println(model.predict(data));

    }
}
