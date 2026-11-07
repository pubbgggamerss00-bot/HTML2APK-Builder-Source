package org.jf.dexlib2;

import java.util.HashMap;

/* loaded from: classes3.dex */
public enum AccessFlags {
    PUBLIC(1, "public", true, true, true),
    PRIVATE(2, "private", true, true, true),
    PROTECTED(4, "protected", true, true, true),
    STATIC(8, "static", true, true, true),
    FINAL(16, "final", true, true, true),
    SYNCHRONIZED(32, "synchronized", false, true, false),
    VOLATILE(64, "volatile", false, false, true),
    BRIDGE(64, "bridge", false, true, false),
    TRANSIENT(128, "transient", false, false, true),
    VARARGS(128, "varargs", false, true, false),
    NATIVE(256, "native", false, true, false),
    INTERFACE(512, "interface", true, false, false),
    ABSTRACT(1024, "abstract", true, true, false),
    STRICTFP(2048, "strictfp", false, true, false),
    SYNTHETIC(4096, "synthetic", true, true, true),
    ANNOTATION(8192, "annotation", true, false, false),
    ENUM(16384, "enum", true, false, true),
    CONSTRUCTOR(65536, "constructor", false, true, false),
    DECLARED_SYNCHRONIZED(131072, "declared-synchronized", false, true, false);

    private static HashMap<String, AccessFlags> accessFlagsByName;
    private static final AccessFlags[] allFlags;
    private String accessFlagName;
    private boolean validForClass;
    private boolean validForField;
    private boolean validForMethod;
    private int value;

    static {
        AccessFlags[] accessFlagsArrValues = values();
        allFlags = accessFlagsArrValues;
        accessFlagsByName = new HashMap<>();
        for (AccessFlags accessFlags : accessFlagsArrValues) {
            accessFlagsByName.put(accessFlags.accessFlagName, accessFlags);
        }
    }

    AccessFlags(int i10, String str, boolean z10, boolean z11, boolean z12) {
        this.value = i10;
        this.accessFlagName = str;
        this.validForClass = z10;
        this.validForMethod = z11;
        this.validForField = z12;
    }

    private static String formatAccessFlags(AccessFlags[] accessFlagsArr) {
        int length = 0;
        for (AccessFlags accessFlags : accessFlagsArr) {
            length += accessFlags.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (AccessFlags accessFlags2 : accessFlagsArr) {
            sb.append(accessFlags2.toString());
            sb.append(" ");
        }
        if (accessFlagsArr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    public static String formatAccessFlagsForClass(int i10) {
        return formatAccessFlags(getAccessFlagsForClass(i10));
    }

    public static String formatAccessFlagsForField(int i10) {
        return formatAccessFlags(getAccessFlagsForField(i10));
    }

    public static String formatAccessFlagsForMethod(int i10) {
        return formatAccessFlags(getAccessFlagsForMethod(i10));
    }

    public static AccessFlags getAccessFlag(String str) {
        return accessFlagsByName.get(str);
    }

    public static AccessFlags[] getAccessFlagsForClass(int i10) {
        int i11 = 0;
        for (AccessFlags accessFlags : allFlags) {
            if (accessFlags.validForClass && (accessFlags.value & i10) != 0) {
                i11++;
            }
        }
        AccessFlags[] accessFlagsArr = new AccessFlags[i11];
        int i12 = 0;
        for (AccessFlags accessFlags2 : allFlags) {
            if (accessFlags2.validForClass && (accessFlags2.value & i10) != 0) {
                accessFlagsArr[i12] = accessFlags2;
                i12++;
            }
        }
        return accessFlagsArr;
    }

    public static AccessFlags[] getAccessFlagsForField(int i10) {
        int i11 = 0;
        for (AccessFlags accessFlags : allFlags) {
            if (accessFlags.validForField && (accessFlags.value & i10) != 0) {
                i11++;
            }
        }
        AccessFlags[] accessFlagsArr = new AccessFlags[i11];
        int i12 = 0;
        for (AccessFlags accessFlags2 : allFlags) {
            if (accessFlags2.validForField && (accessFlags2.value & i10) != 0) {
                accessFlagsArr[i12] = accessFlags2;
                i12++;
            }
        }
        return accessFlagsArr;
    }

    public static AccessFlags[] getAccessFlagsForMethod(int i10) {
        int i11 = 0;
        for (AccessFlags accessFlags : allFlags) {
            if (accessFlags.validForMethod && (accessFlags.value & i10) != 0) {
                i11++;
            }
        }
        AccessFlags[] accessFlagsArr = new AccessFlags[i11];
        int i12 = 0;
        for (AccessFlags accessFlags2 : allFlags) {
            if (accessFlags2.validForMethod && (accessFlags2.value & i10) != 0) {
                accessFlagsArr[i12] = accessFlags2;
                i12++;
            }
        }
        return accessFlagsArr;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isSet(int i10) {
        return (i10 & this.value) != 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.accessFlagName;
    }
}
