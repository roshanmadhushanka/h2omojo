import hex.genmodel.easy.exception.PredictException;
import org.wso2.carbon.ml.siddhi.extension.h2omojo.ModelHandler;

import java.io.IOException;

/**
 * Created by wso2123 on 11/9/16.
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, PredictException {
        ModelHandler model = new ModelHandler("/home/wso2123/Documents/MyProjects/h2omojo/DRF_model_python_1478663061299_1.zip");
        Object[] data = {5.4, 3.7, 1.5, 0.2};
        System.out.println(model.predict(data));

    }
}
