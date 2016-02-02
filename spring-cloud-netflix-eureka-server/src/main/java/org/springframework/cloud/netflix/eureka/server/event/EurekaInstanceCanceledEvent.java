/*
 * Copyright 2013-2015 the original author or authors.
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

package org.springframework.cloud.netflix.eureka.server.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Spencer Gibb
 */
@SuppressWarnings("serial")
public class EurekaInstanceCanceledEvent extends ApplicationEvent {

	private String appName;

	private String serverId;

	private boolean replication;

	public EurekaInstanceCanceledEvent(Object source, String appName, String serverId,
			boolean replication) {
		super(source);
		this.appName = appName;
		this.serverId = serverId;
		this.replication = replication;
	}

	public String getAppName() {
		return this.appName;
	}

	public String getServerId() {
		return this.serverId;
	}

	public boolean isReplication() {
		return this.replication;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public void setReplication(boolean replication) {
		this.replication = replication;
	}

	public String toString() {
		return "org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent(appName="
				+ this.appName + ", serverId=" + this.serverId + ", replication="
				+ this.replication + ")";
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof EurekaInstanceCanceledEvent))
			return false;
		final EurekaInstanceCanceledEvent other = (EurekaInstanceCanceledEvent) o;
		if (!other.canEqual((Object) this))
			return false;
		final Object this$appName = this.getAppName();
		final Object other$appName = other.getAppName();
		if (this$appName == null ?
				other$appName != null :
				!this$appName.equals(other$appName))
			return false;
		final Object this$serverId = this.getServerId();
		final Object other$serverId = other.getServerId();
		if (this$serverId == null ?
				other$serverId != null :
				!this$serverId.equals(other$serverId))
			return false;
		if (this.isReplication() != other.isReplication())
			return false;
		return true;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $appName = this.getAppName();
		result = result * PRIME + ($appName == null ? 0 : $appName.hashCode());
		final Object $serverId = this.getServerId();
		result = result * PRIME + ($serverId == null ? 0 : $serverId.hashCode());
		result = result * PRIME + (this.isReplication() ? 79 : 97);
		return result;
	}

	protected boolean canEqual(Object other) {
		return other instanceof EurekaInstanceCanceledEvent;
	}
}
