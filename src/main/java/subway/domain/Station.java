package subway.domain;

import java.util.Objects;

public class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현


    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Station))
            return false;

        return this.name.equals(((Station) obj).getName());
    }

    @Override
    public String toString() {
        return "[INFO] " + this.name;
    }
}
