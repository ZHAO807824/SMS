package com.sms.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * 通用实体类
 * 
 * @author zhao
 *
 */
@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static <T extends BaseEntity> Map<Integer, T> idEntityMap(Collection<T> list) {
		Map<Integer, T> map = new HashMap<Integer, T>();
		if (null == list || 0 == list.size()) {
			return map;
		}
		for (T entity : list) {
			map.put(entity.getId(), entity);
		}
		return map;
	}

	@Override
	public String toString() {
		return ""+id;
	}

}
