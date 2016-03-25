_author_='betty'
# 导入pymysql
import pymysql
conn=pymysql.connect(host='127.0.0.1',
                       user='root',
                       passwd='',
                       db='zhihu',
                       port=3306,
                       charset='utf8')
try:
# 获取一个数据库连接，注意如果是UTF-8类型的，需要制定数据库

  cur=conn.cursor()#获取一个游标
  sql="INSERT INTO `person` (`id`, `name`,`url`,`followers`) VALUES (%s, %s,%s,%s)"

  cur.execute(sql,('1','betty','www.123.com','12'))
  # connection is not autocommit by default. So you must commit to save
    # your changes.
  conn.commit()

  with conn.cursor() as cursor:
      # Read a single record
      sql = "SELECT `name`, `followers` FROM `person` WHERE `name`=%s"
      cursor.execute(sql, ('betty'))
      result = cursor.fetchone()
      print(result)
finally:
    conn.close()