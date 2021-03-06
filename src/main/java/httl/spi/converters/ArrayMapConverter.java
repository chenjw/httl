package httl.spi.converters;

/*
 * Copyright 2011-2013 HTTL Team.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import httl.internal.util.CollectionUtils;
import httl.spi.Converter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

/**
 * ArrayMapConverter. (SPI, Singleton, ThreadSafe)
 * 
 * @see httl.spi.parsers.ExpressionParser#setMapConverter(Converter)
 * @see httl.spi.parsers.TemplateParser#setMapConverter(Converter)
 * 
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public class ArrayMapConverter implements Converter<Object[], Map<String, Object>> {

	public Map<String, Object> convert(Object[] values, Map<String, Class<?>> types)
			throws IOException, ParseException {
		return CollectionUtils.toMap(types.keySet(), values);
	}

}
