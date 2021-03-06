/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.GetStatisticsResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetStatisticsResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.GetStatisticsResponse.Data.ItemsItem;
import com.aliyuncs.idrsservice.model.v20200630.GetStatisticsResponse.Data.ItemsItem.DetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStatisticsResponseUnmarshaller {

	public static GetStatisticsResponse unmarshall(GetStatisticsResponse getStatisticsResponse, UnmarshallerContext _ctx) {
		
		getStatisticsResponse.setRequestId(_ctx.stringValue("GetStatisticsResponse.RequestId"));
		getStatisticsResponse.setCode(_ctx.stringValue("GetStatisticsResponse.Code"));
		getStatisticsResponse.setMessage(_ctx.stringValue("GetStatisticsResponse.Message"));

		Data data = new Data();

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetStatisticsResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setClientCount(_ctx.longValue("GetStatisticsResponse.Data.Items["+ i +"].ClientCount"));
			itemsItem.setCloudCount(_ctx.longValue("GetStatisticsResponse.Data.Items["+ i +"].CloudCount"));
			itemsItem.setDepartmentName(_ctx.stringValue("GetStatisticsResponse.Data.Items["+ i +"].DepartmentName"));
			itemsItem.setMonth(_ctx.stringValue("GetStatisticsResponse.Data.Items["+ i +"].Month"));

			List<DetailItem> detail = new ArrayList<DetailItem>();
			for (int j = 0; j < _ctx.lengthValue("GetStatisticsResponse.Data.Items["+ i +"].Detail.Length"); j++) {
				DetailItem detailItem = new DetailItem();
				detailItem.setClientCount(_ctx.longValue("GetStatisticsResponse.Data.Items["+ i +"].Detail["+ j +"].ClientCount"));
				detailItem.setCloudCount(_ctx.longValue("GetStatisticsResponse.Data.Items["+ i +"].Detail["+ j +"].CloudCount"));
				detailItem.setDepartmentId(_ctx.stringValue("GetStatisticsResponse.Data.Items["+ i +"].Detail["+ j +"].DepartmentId"));
				detailItem.setDepartmentName(_ctx.stringValue("GetStatisticsResponse.Data.Items["+ i +"].Detail["+ j +"].DepartmentName"));
				detailItem.setMonth(_ctx.integerValue("GetStatisticsResponse.Data.Items["+ i +"].Detail["+ j +"].Month"));

				detail.add(detailItem);
			}
			itemsItem.setDetail(detail);

			items.add(itemsItem);
		}
		data.setItems(items);
		getStatisticsResponse.setData(data);
	 
	 	return getStatisticsResponse;
	}
}