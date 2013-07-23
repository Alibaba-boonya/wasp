/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wasp.plan;

/**
 * Drop Index index on table; Use case is 'drop index index1 on table app1';
 * 
 */
public class DropIndexPlan extends DDLPlan {

  private String indexName;
  private String tableName;

  public DropIndexPlan(String indexName, String tableName) {
    this.indexName = indexName;
    this.tableName = tableName;
  }

  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "DropIndexPlan [indexName=" + indexName + ", tableName=" + tableName
        + "]";
  }
}