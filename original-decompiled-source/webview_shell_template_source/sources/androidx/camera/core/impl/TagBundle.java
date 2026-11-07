package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class TagBundle {
    private static final String CAMERAX_USER_TAG_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.CX";
    private static final TagBundle EMPTY_TAGBUNDLE = new TagBundle(new ArrayMap());
    private static final String USER_TAG_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.";
    protected final Map<String, Object> mTagMap;

    public TagBundle(Map<String, Object> map) {
        this.mTagMap = map;
    }

    public static TagBundle create(Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new TagBundle(arrayMap);
    }

    public static TagBundle emptyBundle() {
        return EMPTY_TAGBUNDLE;
    }

    public static TagBundle from(TagBundle tagBundle) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : tagBundle.listKeys()) {
            arrayMap.put(str, tagBundle.getTag(str));
        }
        return new TagBundle(arrayMap);
    }

    public Object getTag(String str) {
        return this.mTagMap.get(str);
    }

    public Set<String> listKeys() {
        return this.mTagMap.keySet();
    }

    public final String toString() {
        return CAMERAX_USER_TAG_PREFIX;
    }
}
