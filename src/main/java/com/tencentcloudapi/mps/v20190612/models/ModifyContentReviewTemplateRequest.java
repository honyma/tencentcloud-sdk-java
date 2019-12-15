/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyContentReviewTemplateRequest  extends AbstractModel{

    /**
    * 内容审核模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 内容审核模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 内容审核模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 鉴黄控制参数。
    */
    @SerializedName("PornConfigure")
    @Expose
    private PornConfigureInfoForUpdate PornConfigure;

    /**
    * 鉴恐控制参数。
    */
    @SerializedName("TerrorismConfigure")
    @Expose
    private TerrorismConfigureInfoForUpdate TerrorismConfigure;

    /**
    * 鉴政控制参数。
    */
    @SerializedName("PoliticalConfigure")
    @Expose
    private PoliticalConfigureInfoForUpdate PoliticalConfigure;

    /**
    * 用户自定义内容审核控制参数。
    */
    @SerializedName("UserDefineConfigure")
    @Expose
    private UserDefineConfigureInfoForUpdate UserDefineConfigure;

    /**
     * 获取内容审核模板唯一标识。
     * @return Definition 内容审核模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置内容审核模板唯一标识。
     * @param Definition 内容审核模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取内容审核模板名称，长度限制：64 个字符。
     * @return Name 内容审核模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置内容审核模板名称，长度限制：64 个字符。
     * @param Name 内容审核模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取内容审核模板描述信息，长度限制：256 个字符。
     * @return Comment 内容审核模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * 设置内容审核模板描述信息，长度限制：256 个字符。
     * @param Comment 内容审核模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * 获取鉴黄控制参数。
     * @return PornConfigure 鉴黄控制参数。
     */
    public PornConfigureInfoForUpdate getPornConfigure() {
        return this.PornConfigure;
    }

    /**
     * 设置鉴黄控制参数。
     * @param PornConfigure 鉴黄控制参数。
     */
    public void setPornConfigure(PornConfigureInfoForUpdate PornConfigure) {
        this.PornConfigure = PornConfigure;
    }

    /**
     * 获取鉴恐控制参数。
     * @return TerrorismConfigure 鉴恐控制参数。
     */
    public TerrorismConfigureInfoForUpdate getTerrorismConfigure() {
        return this.TerrorismConfigure;
    }

    /**
     * 设置鉴恐控制参数。
     * @param TerrorismConfigure 鉴恐控制参数。
     */
    public void setTerrorismConfigure(TerrorismConfigureInfoForUpdate TerrorismConfigure) {
        this.TerrorismConfigure = TerrorismConfigure;
    }

    /**
     * 获取鉴政控制参数。
     * @return PoliticalConfigure 鉴政控制参数。
     */
    public PoliticalConfigureInfoForUpdate getPoliticalConfigure() {
        return this.PoliticalConfigure;
    }

    /**
     * 设置鉴政控制参数。
     * @param PoliticalConfigure 鉴政控制参数。
     */
    public void setPoliticalConfigure(PoliticalConfigureInfoForUpdate PoliticalConfigure) {
        this.PoliticalConfigure = PoliticalConfigure;
    }

    /**
     * 获取用户自定义内容审核控制参数。
     * @return UserDefineConfigure 用户自定义内容审核控制参数。
     */
    public UserDefineConfigureInfoForUpdate getUserDefineConfigure() {
        return this.UserDefineConfigure;
    }

    /**
     * 设置用户自定义内容审核控制参数。
     * @param UserDefineConfigure 用户自定义内容审核控制参数。
     */
    public void setUserDefineConfigure(UserDefineConfigureInfoForUpdate UserDefineConfigure) {
        this.UserDefineConfigure = UserDefineConfigure;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "PornConfigure.", this.PornConfigure);
        this.setParamObj(map, prefix + "TerrorismConfigure.", this.TerrorismConfigure);
        this.setParamObj(map, prefix + "PoliticalConfigure.", this.PoliticalConfigure);
        this.setParamObj(map, prefix + "UserDefineConfigure.", this.UserDefineConfigure);

    }
}
