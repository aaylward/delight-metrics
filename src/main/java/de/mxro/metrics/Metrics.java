package de.mxro.metrics;

import de.mxro.metrics.helpers.MetricOperation;
import de.mxro.metrics.internal.operations.MarkMeter;

public class Metrics {

    public static MetricsNode createUnsafe() {
        return null;
    }

    public static MetricOperation meter(final String id) {
        return new MarkMeter().setId(id);
    }

}
