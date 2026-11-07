package com.basitce.htmltoapk.data.local.dao;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;
import pg.f0;

/* loaded from: classes.dex */
public interface ProjectDao {
    Object clearWatermarks(tg.e<? super Integer> eVar);

    Object count(tg.e<? super Integer> eVar);

    Object countByKind(String str, tg.e<? super Integer> eVar);

    Object delete(ProjectEntity projectEntity, tg.e<? super f0> eVar);

    sh.f<List<ProjectEntity>> getAll();

    Object getById(long j10, tg.e<? super ProjectEntity> eVar);

    Object insert(ProjectEntity projectEntity, tg.e<? super Long> eVar);

    Object moveToFolder(List<Long> list, Long l10, tg.e<? super f0> eVar);

    Object update(ProjectEntity projectEntity, tg.e<? super f0> eVar);
}
