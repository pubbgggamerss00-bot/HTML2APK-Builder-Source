package org.jf.dexlib2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import nc.a1;
import nc.v;

/* loaded from: classes3.dex */
public enum HiddenApiRestriction {
    WHITELIST(0, "whitelist", false),
    GREYLIST(1, "greylist", false),
    BLACKLIST(2, "blacklist", false),
    GREYLIST_MAX_O(3, "greylist-max-o", false),
    GREYLIST_MAX_P(4, "greylist-max-p", false),
    GREYLIST_MAX_Q(5, "greylist-max-q", false),
    CORE_PLATFORM_API(8, "core-platform-api", true),
    TEST_API(16, "test-api", true);

    private static final int HIDDENAPI_FLAG_MASK = 7;
    private static final HiddenApiRestriction[] domainSpecificApiFlags;
    private static final HiddenApiRestriction[] hiddenApiFlags;
    private static final Map<String, HiddenApiRestriction> hiddenApiRestrictionsByName;
    private final boolean isDomainSpecificApiFlag;
    private final String name;
    private final int value;

    static {
        HiddenApiRestriction hiddenApiRestriction = WHITELIST;
        HiddenApiRestriction hiddenApiRestriction2 = GREYLIST;
        HiddenApiRestriction hiddenApiRestriction3 = BLACKLIST;
        HiddenApiRestriction hiddenApiRestriction4 = GREYLIST_MAX_O;
        HiddenApiRestriction hiddenApiRestriction5 = GREYLIST_MAX_P;
        HiddenApiRestriction hiddenApiRestriction6 = GREYLIST_MAX_Q;
        HiddenApiRestriction hiddenApiRestriction7 = CORE_PLATFORM_API;
        HiddenApiRestriction hiddenApiRestriction8 = TEST_API;
        hiddenApiFlags = new HiddenApiRestriction[]{hiddenApiRestriction, hiddenApiRestriction2, hiddenApiRestriction3, hiddenApiRestriction4, hiddenApiRestriction5, hiddenApiRestriction6};
        domainSpecificApiFlags = new HiddenApiRestriction[]{hiddenApiRestriction7, hiddenApiRestriction8};
        hiddenApiRestrictionsByName = new HashMap();
        for (HiddenApiRestriction hiddenApiRestriction9 : values()) {
            hiddenApiRestrictionsByName.put(hiddenApiRestriction9.toString(), hiddenApiRestriction9);
        }
    }

    HiddenApiRestriction(int i10, String str, boolean z10) {
        this.value = i10;
        this.name = str;
        this.isDomainSpecificApiFlag = z10;
    }

    public static int combineFlags(Iterable<HiddenApiRestriction> iterable) {
        int i10 = 0;
        boolean z10 = false;
        for (HiddenApiRestriction hiddenApiRestriction : iterable) {
            if (hiddenApiRestriction.isDomainSpecificApiFlag) {
                i10 += hiddenApiRestriction.value;
            } else {
                if (z10) {
                    throw new IllegalArgumentException("Cannot combine multiple flags for hidden api restrictions");
                }
                i10 += hiddenApiRestriction.value;
                z10 = true;
            }
        }
        return i10;
    }

    public static HiddenApiRestriction forName(String str) {
        return hiddenApiRestrictionsByName.get(str);
    }

    public static String formatHiddenRestrictions(int i10) {
        StringJoiner stringJoiner = new StringJoiner("|");
        Iterator<HiddenApiRestriction> it = getAllFlags(i10).iterator();
        while (it.hasNext()) {
            stringJoiner.add(it.next().toString());
        }
        return stringJoiner.toString();
    }

    public static Set<HiddenApiRestriction> getAllFlags(int i10) {
        HiddenApiRestriction hiddenApiRestriction = hiddenApiFlags[i10 & 7];
        if ((i10 & (-8)) == 0) {
            int i11 = v.f18759c;
            return new a1(hiddenApiRestriction);
        }
        int i12 = v.f18759c;
        v.a aVar = new v.a();
        aVar.c(hiddenApiRestriction);
        for (HiddenApiRestriction hiddenApiRestriction2 : domainSpecificApiFlags) {
            if (hiddenApiRestriction2.isSet(i10)) {
                aVar.b(hiddenApiRestriction2);
            }
        }
        return aVar.d();
    }

    public int getValue() {
        return this.value;
    }

    public boolean isDomainSpecificApiFlag() {
        return this.isDomainSpecificApiFlag;
    }

    public boolean isSet(int i10) {
        return this.isDomainSpecificApiFlag ? (i10 & this.value) != 0 : (i10 & 7) == this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
