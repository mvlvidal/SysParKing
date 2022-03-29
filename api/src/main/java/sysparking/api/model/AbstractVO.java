package sysparking.api.model;

import java.util.Objects;

public abstract class AbstractVO {
	Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractVO other = (AbstractVO) obj;
		return Objects.equals(id, other.id);
	}
		 
}
