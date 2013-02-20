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
package httl.spi;

import java.text.ParseException;

/**
 * Object Codec. (SPI, Singleton, ThreadSafe)
 * 
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public interface Codec {

	/**
	 * Get the codec format.
	 * 
	 * @return format
	 */
	String getFormat();

	/**
	 * The string is decodable by this codec.
	 * 
	 * @return decodable
	 */
	boolean isDecodable(String str);

	/**
	 * Encode the value as a string.
	 * 
	 * @param value - origin value
	 * @return encoded string
	 */
	String encode(Object value);

	/**
	 * Decode the string as a bean object.
	 * 
	 * @param str - encoded string
	 * @param type - bean type
	 * @return bean object
	 * @throws ParseException If the string cannot be parsed
	 */
	<T> T decode(String str, Class<T> type) throws ParseException;

}