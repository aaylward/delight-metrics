package de.mxro.metrics.internal.operations;

import com.codahale.metrics.Meter;

import de.mxro.async.properties.PropertyData;
import de.mxro.async.properties.operations.PropertyOperationWithId;

public class MarkEvent extends PropertyOperationWithId {

    @Override
    public void perform(final PropertyData data) {
        final Meter meter = data.get(id, Meter.class);

        meter.mark();
    }

}
