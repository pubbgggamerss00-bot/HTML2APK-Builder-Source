package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MutableTagBundle extends TagBundle {
    private MutableTagBundle(Map<String, Object> map) {
        super(map);
    }

    public static MutableTagBundle create() {
        return new MutableTagBundle(new ArrayMap());
    }

    public static MutableTagBundle from(TagBundle tagBundle) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : tagBundle.listKeys()) {
            arrayMap.put(str, tagBundle.getTag(str));
        }
        return new MutableTagBundle(arrayMap);
    }

    public void addTagBundle(TagBundle tagBundle) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.mTagMap;
        if (map2 == null || (map = tagBundle.mTagMap) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void putTag(String str, Object obj) {
        this.mTagMap.put(str, obj);
    }
}
