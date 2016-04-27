package com.hqf.tutorial.test;

import com.hqf.tutorial.gson.CityAreas;
import com.hqf.tutorial.gson.GsonHelper;
import com.hqf.tutorial.gson.ProductPriceAduit;
import com.hqf.tutorial.gson.ProductService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * GsonHelper Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>四月 27, 2016</pre>
 */
public class GsonHelperTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: gson()
     */
    @Test
    public void testGson() throws Exception {
//TODO: Test goes here...

    }

    /**
     * Method: serialize(Date date, Type type, JsonSerializationContext context)
     */
    @Test
    public void testSerialize() throws Exception {
//TODO: Test goes here...
        GsonHelper gsonHelper = new GsonHelper();
        ProductPriceAduit productPriceAduit = new ProductPriceAduit();
        productPriceAduit.setProductId(1);
        productPriceAduit.setProductPriceId(11);

        List<CityAreas> cityAreases = new ArrayList<CityAreas>();
        CityAreas cityArea = new CityAreas();
        cityArea.setCityAreaId(1);
        cityArea.setName("朝阳区");
        cityArea.setFullName("北京-北京市-朝阳区");
        cityAreases.add(cityArea);
        productPriceAduit.setCityAreas(cityAreases);

        List<ProductService> productServices = new ArrayList<ProductService>();
        ProductService productService = new ProductService();
        productService.setProductServiceId(1);
        productService.setIsRequired(true);
        productService.setCost(100);
        productService.setPrice(200);
        productService.setOriginalPrice(500);
        productServices.add(productService);

        productPriceAduit.setProductServices(productServices);


        String json = GsonHelper.gson().toJson(productPriceAduit);

        System.out.println(json);
    }

    /**
     * Method: deserialize(JsonElement element, Type type, JsonDeserializationContext context)
     */
    @Test
    public void testDeserialize() throws Exception {
//TODO: Test goes here...
        String json="{" +
                "  \"product_price_id\": 11," +
                "  \"product_id\": 1," +
                "  \"product_services\": [" +
                "    {" +
                "      \"product_service_Id\": 1," +
                "      \"is_required\": true," +
                "      \"stock\": 0," +
                "      \"price\": 200," +
                "      \"original_price\": 500," +
                "      \"cost\": 100" +
                "    }" +
                "  ]," +
                "  \"city_areas\": [" +
                "    {" +
                "      \"city_area_id\": 1," +
                "      \"name\": \"朝阳区\"," +
                "      \"fullName\": \"北京-北京市-朝阳区\"" +
                "    }" +
                "  ]"
                +"}";

        ProductPriceAduit productPriceAduit= GsonHelper.gson().fromJson(json,ProductPriceAduit.class);
        System.out.println(productPriceAduit.getProductId());
        System.out.println(productPriceAduit.getCityAreas().toArray().length);
        Assert.assertEquals(1,productPriceAduit.getCityAreas().toArray().length);
        System.out.println(productPriceAduit.getProductServices().toArray().length);
        Assert.assertEquals(1,productPriceAduit.getProductServices().toArray().length);
    }


} 
