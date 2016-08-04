package com.courseapp.domain;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "topic_details")
public class TopicDescription implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String topic_description;
	private String topic_name;
	private Time topic_duration;
	private int topic_id;
	public TopicDescription(String topic_description, String topic_name, Time topic_duration, int topic_id) {
		super();
		this.topic_description = topic_description;
		this.topic_name = topic_name;
		this.topic_duration = topic_duration;
		this.topic_id = topic_id;
	}
	public String getTopic_description() {
		return topic_description;
	}
	public void setTopic_description(String topic_description) {
		this.topic_description = topic_description;
	}
	public String getTopic_name() {
		return topic_name;
	}
	public void setTopic_name(String topic_name) {
		this.topic_name = topic_name;
	}
	public Time getTopic_duration() {
		return topic_duration;
	}
	public void setTopic_duration(Time topic_duration) {
		this.topic_duration = topic_duration;
	}
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((topic_description == null) ? 0 : topic_description.hashCode());
		result = prime * result + ((topic_duration == null) ? 0 : topic_duration.hashCode());
		result = prime * result + topic_id;
		result = prime * result + ((topic_name == null) ? 0 : topic_name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TopicDescription other = (TopicDescription) obj;
		if (topic_description == null) {
			if (other.topic_description != null)
				return false;
		} else if (!topic_description.equals(other.topic_description))
			return false;
		if (topic_duration == null) {
			if (other.topic_duration != null)
				return false;
		} else if (!topic_duration.equals(other.topic_duration))
			return false;
		if (topic_id != other.topic_id)
			return false;
		if (topic_name == null) {
			if (other.topic_name != null)
				return false;
		} else if (!topic_name.equals(other.topic_name))
			return false;
		return true;
	}
   
}
