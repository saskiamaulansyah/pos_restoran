# SQL Change LOG for integrated team

### 03-07-2021
> Bima (nambah kolom status di table pemesanan)
``` SQL
ALTER TABLE `pemesanan` ADD `status` ENUM("COMPLETE","PENDING") NOT NULL AFTER `id_menu`; tambahno iki pisan
```

> Angger (nambah kolom status di table meja)
``` SQL
alter table meja add status varchar(20) null;
```