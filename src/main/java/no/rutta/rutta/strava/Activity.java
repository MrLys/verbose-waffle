package no.rutta.rutta.strava;

import no.rutta.rutta.common.Identifiable;

public enum Activity implements Identifiable {
    RIDE(1, "RIDE"),
    RUN(2, "RUN"),
    SWIM(3, "SWIM"),
    WALK(4, "WALK"),
    HIKE(5, "HIKE"),
    ALPINE_SKI(6, "ALPINE SKI"),
    BACKCOUNTRY_SKI(7, "BACKCOUNTRY SKI"),
    CANOE(8, "CANOE"),
    CROSSFIT(9, "CROSSFIT"),
    E_BIKE_RIDE(10, "E_BIKE RIDE"),
    ELLIPTICAL(11, "ELLIPTICAL"),
    HANDCYCLE(12, "HANDCYCLE"),
    ICE_SKATE(13, "ICE SKATE"),
    INLINE_SKATE(14, "INLINE SKATE"),
    KAYAK(15, "KAYAK"),
    KITESURF_SESSION(16, "KITESURF SESSION"),
    NORDIC_SKI(17, "NORDIC SKI"),
    ROCK_CLIMB(18, "ROCK CLIMB"),
    ROLLER_SKI(19, "ROLLER SKI"),
    ROW(20, "ROW"),
    SNOWBOARD(21, "SNOWBOARD"),
    SNOWSHOE(22, "SNOWSHOE"),
    STAIR_STEPPER(23, "STAIR STEPPER"),
    STAND_UP_PADDLE(24, "STAND UP PADDLE"),
    SURF(25, "SURF"),
    VIRTUAL_RIDE(26, "VIRTUAL RIDE"),
    VIRTUAL_RUN(27, "VIRTUAL RUN"),
    WEIGHT_TRAINING(28, "WEIGHT TRAINING"),
    WINDSURF_SESSION(29, "WINDSURF SESSION"),
    WHEELCHAIR(30, "WHEELCHAIR"),
    WORKOUT(31, "WORKOUT"),
    YOGA(32, "YOGA");
    private final String activityName;
    private final int id;
    Activity(int id, String activityName) {
       this.activityName =activityName;
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}
