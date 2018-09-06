package exprivia;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dlfileentry")
public class Dlfileentry implements java.io.Serializable{
	
	private long fileEntryId;
	private String version;
	private String uuid;
	private Long groupId;
	private Long companyId;
	private Long userId;
	private String userName;
	private Date createDate;
	private Date modifiedDate;
	private Long classNameId;
	private Long classPk;
	private Long repositoryId;
	private Long folderId;
	private String treePath;
	private String name;
	private String extension;
	private String mimeType;
	private String title;
	private String description;
	private String extraSettings;
	private Long fileEntryTypeId;
	private Long size;
	private Integer readCount;
	private Long smallImageId;
	private Long largeImageId;
	private Long custom1imageId;
	private Long custom2imageId;
	private Byte manualCheckInRequired;

	public Dlfileentry() {
	}

	public Dlfileentry(long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	public Dlfileentry(long fileEntryId, String uuid, Long groupId,
			Long companyId, Long userId, String userName, Date createDate,
			Date modifiedDate, Long classNameId, Long classPk,
			Long repositoryId, Long folderId, String treePath, String name,
			String extension, String mimeType, String title,
			String description, String extraSettings, Long fileEntryTypeId,
			Long size, Integer readCount, Long smallImageId, Long largeImageId,
			Long custom1imageId, Long custom2imageId, Byte manualCheckInRequired) {
		this.fileEntryId = fileEntryId;
		this.uuid = uuid;
		this.groupId = groupId;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.classNameId = classNameId;
		this.classPk = classPk;
		this.repositoryId = repositoryId;
		this.folderId = folderId;
		this.treePath = treePath;
		this.name = name;
		this.extension = extension;
		this.mimeType = mimeType;
		this.title = title;
		this.description = description;
		this.extraSettings = extraSettings;
		this.fileEntryTypeId = fileEntryTypeId;
		this.size = size;
		this.readCount = readCount;
		this.smallImageId = smallImageId;
		this.largeImageId = largeImageId;
		this.custom1imageId = custom1imageId;
		this.custom2imageId = custom2imageId;
		this.manualCheckInRequired = manualCheckInRequired;
	}

	@Id
	@Column(name = "fileEntryId", unique = true)
	public long getFileEntryId() {
		return this.fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		this.fileEntryId = fileEntryId;
	}

	@Column(name = "version", length = 75)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "uuid_", length = 75)
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "groupId")
	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Column(name = "companyId")
	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	@Column(name = "userId")
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "userName", length = 75)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate", length = 19)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "classNameId")
	public Long getClassNameId() {
		return this.classNameId;
	}

	public void setClassNameId(Long classNameId) {
		this.classNameId = classNameId;
	}

	@Column(name = "classPK")
	public Long getClassPk() {
		return this.classPk;
	}

	public void setClassPk(Long classPk) {
		this.classPk = classPk;
	}

	@Column(name = "repositoryId")
	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
	}

	@Column(name = "folderId")
	public Long getFolderId() {
		return this.folderId;
	}

	public void setFolderId(Long folderId) {
		this.folderId = folderId;
	}

	@Column(name = "treePath")
	public String getTreePath() {
		return this.treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "extension", length = 75)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Column(name = "mimeType", length = 75)
	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "extraSettings")
	public String getExtraSettings() {
		return this.extraSettings;
	}

	public void setExtraSettings(String extraSettings) {
		this.extraSettings = extraSettings;
	}

	@Column(name = "fileEntryTypeId")
	public Long getFileEntryTypeId() {
		return this.fileEntryTypeId;
	}

	public void setFileEntryTypeId(Long fileEntryTypeId) {
		this.fileEntryTypeId = fileEntryTypeId;
	}

	@Column(name = "size_")
	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	@Column(name = "readCount")
	public Integer getReadCount() {
		return this.readCount;
	}

	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}

	@Column(name = "smallImageId")
	public Long getSmallImageId() {
		return this.smallImageId;
	}

	public void setSmallImageId(Long smallImageId) {
		this.smallImageId = smallImageId;
	}

	@Column(name = "largeImageId")
	public Long getLargeImageId() {
		return this.largeImageId;
	}

	public void setLargeImageId(Long largeImageId) {
		this.largeImageId = largeImageId;
	}

	@Column(name = "custom1ImageId")
	public Long getCustom1imageId() {
		return this.custom1imageId;
	}

	public void setCustom1imageId(Long custom1imageId) {
		this.custom1imageId = custom1imageId;
	}

	@Column(name = "custom2ImageId")
	public Long getCustom2imageId() {
		return this.custom2imageId;
	}

	public void setCustom2imageId(Long custom2imageId) {
		this.custom2imageId = custom2imageId;
	}

	@Column(name = "manualCheckInRequired")
	public Byte getManualCheckInRequired() {
		return this.manualCheckInRequired;
	}

	public void setManualCheckInRequired(Byte manualCheckInRequired) {
		this.manualCheckInRequired = manualCheckInRequired;
	}

}
