/**
 * Created by huoquanfu on 2016/4/27.
 */
package com.hqf.tutorial.gson;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GsonHelper {

    private static final String format = "yyyyMMddHHmmss";

    public static SimpleDateFormat dateFormat = new SimpleDateFormat(format);

    private static final Gson g = new GsonBuilder()
            .registerTypeAdapter(Date.class,
                    new UtilDateSerializer())
            .setDateFormat(format).setPrettyPrinting()
            .create();

    public static Gson gson() {
        return g;
    }

    private static class UtilDateSerializer implements JsonSerializer<Date>, JsonDeserializer<Date> {

        public JsonElement serialize(Date date, Type type, JsonSerializationContext context) {
            return new JsonPrimitive(dateFormat.format(date));
        }

        public Date deserialize(JsonElement element, Type type, JsonDeserializationContext context)
                throws JsonParseException {
            try {
                return dateFormat.parse(element.getAsJsonPrimitive().getAsString());
            } catch (ParseException e) {

            }
            return null;
        }

    }

}