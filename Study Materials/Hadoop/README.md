# Hadoop
- Support Huge Volume
- Storage Efficiency
- Good Data Recovery Solution
- Horizontal Scalability
- Cost Effective
- Easy to Use

## HDFS (Hadoop Distributed File System)

    - Why another filesystem?
    - Significance of Blocks
    - Read/Write
    - Data locality, replica placement , etc
    - HDFC Commands

[HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_design.html) is a distributed file system that handles large data sets running on commodity hardware. It is used to scale a single Apache Hadoop cluster to hundreds (and even thousands) of nodes. HDFS is one of the major components of Apache Hadoop, the others being MapReduce and YARN.

#### Local File System Commands

| Command | Description |
| --- | --- |
| `ls` | List the contents of the current directory |
| `ls -l` | List the contents of the current directory in long format |
| `ls -a` | List the contents of the current directory including hidden files |
| `mkdir` | Create a new directory |
| `cd` | Change directory |
| `cd ..` | Change directory to the parent directory |
| `cd ~` | Change directory to the home directory |
| `pwd` | Print the current working directory |
| `touch` | Create a new file |
| `cat` | Display the contents of a file |
| `cp` | Copy a file |
| `mv` | Move a file |
| `rm` | Remove a file |
| `rm -r` | Remove a directory |
| `head` | Display the first few lines of a file |
| `tail` | Display the last few lines of a file |

#### HDFS Commands

| Command | Description |
| --- | --- |
| `hadoop fs -ls /` | List the contents of the root directory |
| `hadoop fs -ls` | List the contents of the current directory |
| `hadoop fs -mkdir <folder name>` | Create a new directory |
| `hadoop fs -copyFromLocal <target location> <from location>` | Copy a file from the local file system to HDFS |
| `hadoop fs -copyToLocal <from location> <target location>` | Copy a file from HDFS to the local file system |
| `hadoop fs -cp <from location> <target location>` | Copy a file from one location to another in HDFS |
| `hadoop fs -mv <from location> <target location>` | Move a file from one location to another in HDFS |
| `hadoop fs -rm <file name>` | Remove a file |
| `hadoop fs -ls <foldername>` | List the contents of a directory|
| `hadoop fs -Ddfs.replication=2 -put <from location> <target location>` | Copy a file from the local file system to HDFS and set the replication factor to 2 |
| `hadoop -fs -chmod 777 <foldername>` | Change the permissions of a folder |
| `sudo -u hdfs hdfs fsck /` | Check the health of the HDFS |
| `sudo -u hdfs hdfs fsck / -files -blocks -locations` | Check the health of the HDFS and display the files, blocks and locations |
| `sudo -u hdfs hdfs fsck / -files -blocks -locations -racks` | Check the health of the HDFS and display the files, blocks, locations and racks |


## MapReduce
    
    - MapReduce Phases
    - Shuffle process
    - MapReduce Components
    - Dissect a MR program
    - Custom formats / writables

[MapReduce](https://hadoop.apache.org/docs/r1.2.1/mapred_tutorial.html) is a programming model and an associated implementation for processing and generating big data sets with a parallel, distributed algorithm on a cluster. A MapReduce program is composed of a map procedure, which performs filtering and sorting (such as sorting students by first name into queues, one queue for each name), and a reduce method, which performs a summary operation (such as counting the number of students in each queue, yielding name frequencies).

#### Three Pases of MapReduce

1. Map
    i. Input Split
    ii. Mapper
    iii. Key-Value Pairs
2. Shuffle
3. Reduce
    i. Reducer
    ii. Output





## PIG (Apache Pig)
    - Pig Latin
    - Joins
    - Custom functions
    - XML Parsing

## Hive (Apache Hive)
    - HiveQL
    - Table types
    - Partitions / Buckets
    - Joins
    - Complex types

[Hive](https://hive.apache.org/) is a data warehouse infrastructure tool to process structured data in Hadoop. It resides on top of Hadoop to summarize Big Data, and makes querying and analyzing easy. Hive provides a mechanism to project structure onto this data and query the data using a SQL-like language called HiveQL.

## YARN (Yet Another Resource Negotiator)

[YARN](https://hadoop.apache.org/docs/r1.2.1/yarn.html) is a resource management platform responsible for managing computing resources in clusters and using them for scheduling of users' applications. The fundamental idea of YARN is to split up the functionalities of resource management and job scheduling/monitoring into separate daemons. The idea is to have a global ResourceManager (RM) and per-application ApplicationMaster (AM). An application is either a single job or a DAG of jobs.

## Architecture
    - HDFS Architecture
    - MRv1 vs MRv2 Architecture
    - SPOF
    - SNN - Standby - Checkpoint Nodes
    - Highly available Hadoop

## Cluster Setup
    - Distributions
    - Cloud Services
    - Amazon Web Services
    - 3-node cluster on cloud

## File Formats
    - Compression
    - Sequence Files
    - Small files problem and solutions
    - AVRO
    - Highly available Hadoop
    - File formats with MR, Pig, Hive

## Troubleshooting and Optimization
    - Mapreduce settings
    - Optimize low running jobs
    - Explore logs
    - Optimize Pig / Hive
    - Join optimization.

### HBase
- [HBase](https://hbase.apache.org/) is an open-source, distributed, versioned, non-relational database modeled after Google's Bigtable: A Distributed Storage System for Structured Data by Chang et al. Just as Bigtable leverages the distributed data storage provided by the Google File System, HBase provides Bigtable-like capabilities on top of Apache Hadoop.