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
package org.apache.ambari.server.state;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the state of an mpack.
 */
public class Mpack {

  private Long mpackId;

  private Long registryId;

  @SerializedName("name")
  private String name;

  @SerializedName("version")
  private String version;

  @SerializedName("artifacts-path")
  private String artifactsPath;

  @SerializedName("prerequisites")
  private Map<String, String> prerequisites;

  @SerializedName("modules")
  private List<Module> modules;

  @SerializedName("modules-path")
  private String modulesPath;

  @SerializedName("mpack-path")
  private String mpackPath;

  @SerializedName("stack-id")
  private String stackId;

  @SerializedName("definition")
  private String definition;

  @SerializedName("description")
  private String description;

  private String mpackUri;

  public Long getMpackId() {
    return mpackId;
  }

  public void setMpackId(Long mpackId) {
    this.mpackId = mpackId;
  }

  public Long getRegistryId() {
    return registryId;
  }

  public void setRegistryId(Long registryId) {
    this.registryId = registryId;
  }

  public String getMpackUri() {
    return mpackUri;
  }

  public void setMpackUri(String mpackUri) {
    this.mpackUri = mpackUri;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Map<String, String> getPrerequisites() {
    return prerequisites;
  }

  public void setPrerequisites(Map<String, String> prerequisites) {
    this.prerequisites = prerequisites;
  }

  public List<Module> getModules() {
    return modules;
  }

  public void setModules(List<Module> modules) {
    this.modules = modules;
  }

  public String getStackId() {
    return stackId;
  }

  public void setStackId(String stackId) {
    this.stackId = stackId;
  }

  public String getArtifactsPath() {
    return artifactsPath;
  }

  public void setArtifactsPath(String artifactsPath) {
    this.artifactsPath = artifactsPath;
  }

  public String getModulesPath() {
    return modulesPath;
  }

  public void setModulesPath(String modulesPath) {
    this.modulesPath = modulesPath;
  }

  public String getMpackPath() {
    return mpackPath;
  }

  public void setMpackPath(String mpackPath) {
    this.mpackPath = mpackPath;
  }

  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Mpack mpack = (Mpack) o;

    if (!mpackId.equals(mpack.mpackId)) return false;
    if (registryId != null ? !registryId.equals(mpack.registryId) : mpack.registryId != null) return false;
    if (!name.equals(mpack.name)) return false;
    if (!version.equals(mpack.version)) return false;
    if (!artifactsPath.equals(mpack.artifactsPath)) return false;
    if (!prerequisites.equals(mpack.prerequisites)) return false;
    if (!modules.equals(mpack.modules)) return false;
    if (!modulesPath.equals(mpack.modulesPath)) return false;
    if (!mpackPath.equals(mpack.mpackPath)) return false;
    if (!stackId.equals(mpack.stackId)) return false;
    if (!definition.equals(mpack.definition)) return false;
    if (!description.equals(mpack.description)) return false;
    return mpackUri.equals(mpack.mpackUri);
  }

  @Override
  public int hashCode() {
    int result = mpackId.hashCode();
    result = 31 * result + (registryId != null ? registryId.hashCode() : 0);
    result = 31 * result + name.hashCode();
    result = 31 * result + version.hashCode();
    result = 31 * result + artifactsPath.hashCode();
    result = 31 * result + prerequisites.hashCode();
    result = 31 * result + modules.hashCode();
    result = 31 * result + modulesPath.hashCode();
    result = 31 * result + mpackPath.hashCode();
    result = 31 * result + stackId.hashCode();
    result = 31 * result + definition.hashCode();
    result = 31 * result + description.hashCode();
    result = 31 * result + mpackUri.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Mpack{" +
            "mpackId=" + mpackId +
            ", registryId=" + registryId +
            ", name='" + name + '\'' +
            ", version='" + version + '\'' +
            ", artifactsPath='" + artifactsPath + '\'' +
            ", prerequisites=" + prerequisites +
            ", modules=" + modules +
            ", modulesPath='" + modulesPath + '\'' +
            ", mpackPath='" + mpackPath + '\'' +
            ", stackId='" + stackId + '\'' +
            ", definition='" + definition + '\'' +
            ", description='" + description + '\'' +
            ", mpackUri='" + mpackUri + '\'' +
            '}';
  }

  public void copyFrom(Mpack mpack) {
    if (this.name == null) {
      this.name = mpack.getName();
    }
    if (this.mpackId == null) {
      this.mpackId = mpack.getMpackId();
    }
    if (this.version == null) {
      this.version = mpack.getVersion();
    }
    if (this.stackId == null) {
      this.stackId = mpack.getStackId();
    }
    if (this.registryId == null) {
      this.registryId = mpack.getRegistryId();
    }
    if (this.description == null) {
      this.description = mpack.getDescription();
    }
    if (this.modules == null) {
      this.modules = mpack.getModules();
    }
    if (this.artifactsPath == null) {
      this.artifactsPath = mpack.getArtifactsPath();
    }
    if (this.prerequisites == null) {
      this.prerequisites = mpack.getPrerequisites();
    }
    if (this.modulesPath == null) {
      this.modulesPath = mpack.getModulesPath();
    }
    if (this.mpackPath == null) {
      this.mpackPath = mpack.getMpackPath();
    }
    if (this.definition == null) {
      this.definition = mpack.getDefinition();
    }
  }
}