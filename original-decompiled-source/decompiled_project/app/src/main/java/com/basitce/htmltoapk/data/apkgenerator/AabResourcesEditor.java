package com.basitce.htmltoapk.data.apkgenerator;

import com.android.aapt.Resources;
import com.google.protobuf.InvalidProtocolBufferException;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class AabResourcesEditor {
    public static final int $stable = 0;
    public static final AabResourcesEditor INSTANCE = new AabResourcesEditor();

    private AabResourcesEditor() {
    }

    public final Resources.ResourceTable parse(byte[] bytes) throws InvalidProtocolBufferException {
        r.e(bytes, "bytes");
        Resources.ResourceTable from = Resources.ResourceTable.parseFrom(bytes);
        r.d(from, "parseFrom(...)");
        return from;
    }

    public final byte[] serialize(Resources.ResourceTable table) {
        r.e(table, "table");
        byte[] byteArray = table.toByteArray();
        r.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final Resources.ResourceTable updatePackageName(Resources.ResourceTable table, String newPackageName) {
        r.e(table, "table");
        r.e(newPackageName, "newPackageName");
        if (table.getPackageCount() == 0) {
            throw new IllegalStateException("ResourceTable contains no packages");
        }
        Resources.ResourceTable.Builder builder = table.toBuilder();
        Resources.Package.Builder builder2 = builder.getPackage(0).toBuilder();
        builder2.setPackageName(newPackageName);
        builder.setPackage(0, builder2.build());
        Resources.ResourceTable resourceTableBuild = builder.build();
        r.d(resourceTableBuild, "build(...)");
        return resourceTableBuild;
    }
}
