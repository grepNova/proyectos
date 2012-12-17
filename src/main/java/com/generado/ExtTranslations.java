package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ExtTranslations generated by hbm2java
 */
@Entity
@Table(name = "ext_translations", uniqueConstraints = @UniqueConstraint(columnNames = {
		"locale", "object_class", "foreign_key", "field" }))
public class ExtTranslations implements java.io.Serializable {

	private int id;
	private String locale;
	private String objectClass;
	private String field;
	private String foreignKey;
	private String content;

	public ExtTranslations() {
	}

	public ExtTranslations(int id, String locale, String objectClass,
			String field, String foreignKey) {
		this.id = id;
		this.locale = locale;
		this.objectClass = objectClass;
		this.field = field;
		this.foreignKey = foreignKey;
	}

	public ExtTranslations(int id, String locale, String objectClass,
			String field, String foreignKey, String content) {
		this.id = id;
		this.locale = locale;
		this.objectClass = objectClass;
		this.field = field;
		this.foreignKey = foreignKey;
		this.content = content;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "locale", nullable = false, length = 8)
	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Column(name = "object_class", nullable = false)
	public String getObjectClass() {
		return this.objectClass;
	}

	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}

	@Column(name = "field", nullable = false, length = 32)
	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Column(name = "foreign_key", nullable = false, length = 64)
	public String getForeignKey() {
		return this.foreignKey;
	}

	public void setForeignKey(String foreignKey) {
		this.foreignKey = foreignKey;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
