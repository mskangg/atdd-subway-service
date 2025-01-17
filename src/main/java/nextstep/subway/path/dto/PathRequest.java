package nextstep.subway.path.dto;

public class PathRequest {
    private Long source;
    private Long target;

    protected PathRequest() {
    }

    public PathRequest(Long source, Long target) {
        this.source = source;
        this.target = target;
    }

    public Long getSource() {
        return source;
    }

    public Long getTarget() {
        return target;
    }
}
